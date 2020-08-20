package com.DesignPatterns.Adapter.Exercise;

public class GmailClient  {
    public void connect() {
        System.out.println("Connecting to Gmail");
    }

    public void getEmails() {
        System.out.println("Downloading emails from Gmail");
    }

    public void disconnect() {
        System.out.println("Disconnecting from Gmail");
    }
}
