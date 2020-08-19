package com.DesignPatterns.ChainOfResponsibility.Exercise;

public abstract class FileReader {
    private FileReader next;

    public FileReader(FileReader next) {
        this.next = next;
    }

    public void read(String filename) {
        if (doRead(filename))
            return;
        if (next != null)
            next.doRead(filename);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    public abstract boolean doRead(String filename);
}
