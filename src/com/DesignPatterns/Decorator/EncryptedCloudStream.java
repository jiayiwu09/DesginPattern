package com.DesignPatterns.Decorator;

public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypted(data);
        stream.write(encrypted);
    }

    private String encrypted(String data) {
        return "!W#@!$!@#@!";
    }
}
