package com.DesignPatterns.Strategy.Exercise;

public class AES implements EncryptionAlgorithm{

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting with AES");
    }
}
