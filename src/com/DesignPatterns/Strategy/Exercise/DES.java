package com.DesignPatterns.Strategy.Exercise;

public class DES implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting with DES");
    }
}
