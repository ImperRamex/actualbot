package com.company;

import com.company.api.State;

import java.util.Hashtable;

public class BotLogic {

    public static void work() {
        var stateContainer = new Hashtable<String, State>();
        var reader = new ConsoleMessageReader();
        var sender = new ConsoleMessageSender();
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

