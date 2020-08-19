package com.DesignPatterns.ChainOfResponsibility.Exercise;

import com.DesignPatterns.Observer.DataSource;

public class Main {
    public static void main(String[] args) {
        var qbw = new QbwReader(null);
        var num = new NumReader(qbw);
        var xls = new XlsReader(num);
        var dataReader = new DataReader(xls);
        dataReader.read("abc.qbw");
    }
}
