package com.DesignPatterns.Strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Filtering Black and White");
    }
}
