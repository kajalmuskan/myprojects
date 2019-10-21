package com.sunil.demo2.model;

import java.io.Serializable;

public class ChatObject implements Serializable {
    private String chatMessage;
    private String time;
    private String senderName;

    public ChatObject(final String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public ChatObject(final String chatMessage, final String time, final String senderName) {
        this.chatMessage = chatMessage;
        this.time = time;
        this.senderName = senderName;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    public String getTime() {
        return time;
    }

    public String getSenderName() {
        return senderName;
    }
}
