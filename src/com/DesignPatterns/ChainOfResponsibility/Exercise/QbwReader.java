package com.DesignPatterns.ChainOfResponsibility.Exercise;

public class QbwReader extends FileReader {
    public QbwReader(FileReader next) {
        super(next);
    }

    @Override
    public boolean doRead(String filename) {
        var isQbw = filename.endsWith(".qbw");
        if (isQbw)
            System.out.println("Reading data from a QuickBooks file.");
        return isQbw;
    }
}
