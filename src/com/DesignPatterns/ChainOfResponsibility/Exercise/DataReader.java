package com.DesignPatterns.ChainOfResponsibility.Exercise;

public class DataReader {
    private FileReader fileReader;

    public DataReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void read(String fileName) {
        fileReader.read(fileName);
    }
}
