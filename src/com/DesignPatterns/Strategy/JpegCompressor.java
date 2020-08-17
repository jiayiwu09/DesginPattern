package com.DesignPatterns.Strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing to JEPG");
    }
}
