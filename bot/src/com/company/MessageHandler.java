package com.company;

import com.company.api.IMessageHandler;
import com.company.api.IMessageSender;
import com.company.api.State;

public class MessageHandler implements IMessageHandler {

    private IMessageSender sender;

    public MessageHandler(IMessageSender sender) {

        this.sender = sender;
    }

    @Override
    public void handleMessage(String message, State state) {
        if (state.state == 0) {
            sender.sendMessage(Repository.GetDefaultMessage(state.state));
            state.state += 1;
        } else if (state.state == 1) {
            sender.sendMessage(Repository.GetAnecdote(Integer.parseInt(message)));
            state.state += 1;
            sender.sendMessage(Repository.GetDefaultMessage(state.state));
            state.state +=1;
        }else if (state.state == 3) {
            sender.sendMessage(Repository.AnswerFromBot(Integer.parseInt(message)));
            sender.sendMessage(Repository.GetDefaultMessage(state.state));
            state.state = 1;
        }
    }
}

