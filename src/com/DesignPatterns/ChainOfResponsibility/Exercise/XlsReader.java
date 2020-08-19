package com.DesignPatterns.ChainOfResponsibility.Exercise;

public class XlsReader extends FileReader {
    public XlsReader(FileReader next) {
        super(next);
    }

    @Override
    public boolean doRead(String filename) {
        var isExcel = filename.endsWith(".xls");
        if (isExcel)
            System.out.println("Reading data from an Excel spreadsheet.");
        return isExcel;
    }
}
