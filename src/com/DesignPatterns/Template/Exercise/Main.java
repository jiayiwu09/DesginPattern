package com.DesignPatterns.Template.Exercise;

public class Main {
    public static void main(String[] args) {
        var chatWindow = new ChatWindow();
        chatWindow.close();

        var fileWindow = new FileWindow();
        fileWindow.close();
    }
}
