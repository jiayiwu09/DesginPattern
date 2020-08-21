package com.DesignPatterns.Bridge;

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Samsung: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turn off");
    }

    @Override
    public void setChanel(int number) {
        System.out.println("Samsung: set chanel");
    }
}
