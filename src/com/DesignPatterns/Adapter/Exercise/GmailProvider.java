package com.DesignPatterns.Adapter.Exercise;

public class GmailProvider implements EmailProvider{
    private GmailClient gmail;

    public GmailProvider(GmailClient gmail) {
        this.gmail = gmail;
    }

    @Override
    public void downloadEmails() {
        gmail.connect();
        gmail.getEmails();
        gmail.disconnect();
    }
}
