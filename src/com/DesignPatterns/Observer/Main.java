package com.DesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        var datasource = new DataSource();
        var sheet1 = new SpreadSheet(datasource);
        var sheet2 = new SpreadSheet(datasource);
        var chart = new Chart(datasource);

        datasource.setValue(1);
    }
}
