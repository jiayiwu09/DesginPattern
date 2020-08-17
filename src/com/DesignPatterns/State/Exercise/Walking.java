package com.DesignPatterns.State.Exercise;

public class Walking implements TravelMode {
    @Override
    public int getETA() {
        System.out.println("Calculating ETA (Walking)");
        return 1;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Walking)");
        return 1;
    }
}
