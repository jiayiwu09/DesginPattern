package com.DesignPatterns.Strategy;

public class ImageStore {
    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
