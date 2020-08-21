package com.DesignPatterns.Bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turn off");
    }

    @Override
    public void setChanel(int number) {
        System.out.println("Sony: set chanel");
    }
}
