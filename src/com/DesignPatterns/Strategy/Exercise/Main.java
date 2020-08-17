package com.DesignPatterns.Strategy.Exercise;

public class Main {
    public static  void main(String[] args) {
        var chatClient = new ChatClient(new AES());
        chatClient.send("AAAA");

        chatClient = new ChatClient(new DES());
        chatClient.send("BBBBB");
    }
}
