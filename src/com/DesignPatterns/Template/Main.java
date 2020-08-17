package com.DesignPatterns.Template;

public class Main {
    public static void main(String[] args) {
        var task1 = new TransferMoney();
        task1.execute();
        var task2 = new GenerateReport();
        task2.execute();
    }
}
