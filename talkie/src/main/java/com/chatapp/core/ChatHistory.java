package com.chatapp.core;

import java.util.ArrayList;
import java.util.List;

public class ChatHistory {
    private final List<Message> messages;

    public ChatHistory() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return new ArrayList<>(messages);
    }

    public List<Message> getMessagesBySender(String senderId) {
        return messages.stream().filter(message -> message.getSenderId().equals(senderId)).toList();

        // For each implementation: 
        // List<Message> filteredMessages = new ArrayList<>();
        // for (Message message : messages) {
        //     if (message.getSenderId().equals(senderId)) {
        //         filteredMessages.add(message);
        //     }
        // }
        // return filteredMessages;
    }

    public int getMessageCount() {
        return messages.size();
    }
}
