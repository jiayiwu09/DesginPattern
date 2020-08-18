package com.DesignPatterns.Observer;

public class SpreadSheet implements Observer{
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
        this.dataSource.addObserver(this);
    }

    @Override
    public void update(int value) {
        System.out.println("SpreadSheet get updated: " + value);
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet get updated: " + dataSource.getValue());
    }
}
