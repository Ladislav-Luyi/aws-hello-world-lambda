package com.example;

public class Message {
    private final String s;

    public Message(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Message{" +
                "s='" + s + '\'' +
                '}';
    }
}
