package com.DesignPatterns.Observer;

public class Chart implements Observer{
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
        this.dataSource.addObserver(this);
    }
    @Override
    public void update(int value) {
        System.out.println("Chart got updated: " + value);
    }

    @Override
    public void update() {
        System.out.println("Chart got updated: " + dataSource.getValue());
    }
}
