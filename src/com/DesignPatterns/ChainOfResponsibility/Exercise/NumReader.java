package com.DesignPatterns.ChainOfResponsibility.Exercise;

public class NumReader extends FileReader {
    public NumReader(FileReader next) {
        super(next);
    }

    @Override
    public boolean doRead(String filename) {
        var isNum = filename.endsWith(".numbers");
        if (isNum)
            System.out.println("Reading data from a Numbers spreadsheet.");
        return isNum;
    }
}
