package com.DesignPatterns.State.Exercise;

public class Driving implements TravelMode {
    @Override
    public int getETA() {
        System.out.println("Calculating ETA (Driving)");
        return 4;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Driving)");
        return 4;
    }
}
