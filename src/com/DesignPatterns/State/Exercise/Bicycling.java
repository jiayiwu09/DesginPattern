package com.DesignPatterns.State.Exercise;

public class Bicycling implements TravelMode {
    @Override
    public int getETA() {
        System.out.println("Calculating ETA (Bicycling)");
        return 2;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Bicycling)");
        return 2;
    }
}
