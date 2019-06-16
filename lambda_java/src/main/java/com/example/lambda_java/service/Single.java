package com.example.lambda_java.service;


public class Single {
    public String text;

    public Single() {
    }

    public Single(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Single{" +
                "text='" + text + '\'' +
                '}';
    }
}
