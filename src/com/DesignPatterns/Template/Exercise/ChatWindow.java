package com.DesignPatterns.Template.Exercise;

public class ChatWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Remember to save data before closing");
    }
}
