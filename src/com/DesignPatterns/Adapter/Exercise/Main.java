package com.DesignPatterns.Adapter.Exercise;

public class Main {
    public static void main(String[] args) {
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailProvider(new GmailClient()));

        emailClient.downloadEmails();
    }
}
