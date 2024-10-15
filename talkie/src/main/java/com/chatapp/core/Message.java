package com.chatapp.core;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {
    private final String id;
    private final String senderId;
    private final String content;
    private final LocalDateTime timestamp;

    public Message(String senderId, String content) {
        this.id = UUID.randomUUID().toString();
        this.senderId = senderId;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", senderId='" + senderId + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

}
