package com.DesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        var imageStore = new ImageStore();
        imageStore.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStore.store("b", new PngCompressor(), new HighContrastFilter());
    }
}
