package com.DesignPatterns.Adapter.Exercise;

public class GmailProvider implements EmailProvider{
    private GmailClient gmail = new GmailClient();

    @Override
    public void downloadEmails() {
        gmail.connect();
        gmail.getEmails();
        gmail.disconnect();
    }
}
