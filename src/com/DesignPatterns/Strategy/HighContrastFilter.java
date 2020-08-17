package com.DesignPatterns.Strategy;

public class HighContrastFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Filtering High Contrast");
    }
}
