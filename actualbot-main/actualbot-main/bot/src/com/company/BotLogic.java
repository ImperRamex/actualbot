package com.company;

import com.company.api.IMessageReader;
import com.company.api.IMessageSender;
import com.company.api.State;

import java.util.Hashtable;

public class BotLogic {

    public BotLogic(IMessageReader reader, IMessageSender sender) {
        var stateContainer = new Hashtable<String, State>();
        var handler = new MessageHandler(sender);

        while (true) {
            var message = reader.readMessage();
            String userId = "console";
            if(!stateContainer.containsKey(userId))
            {
                stateContainer.put(userId, new State());
            }
            var state = stateContainer.get(userId);
            handler.handleMessage(message, state);

        }
    }
}

