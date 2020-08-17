package com.DesignPatterns.Iterator.Exercise;

public interface Iterator {
    boolean hasNext();
    Product current();
    void next();
}
