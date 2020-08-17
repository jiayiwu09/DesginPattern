package com.DesignPatterns.State.Exercise;

public class Transit implements TravelMode {
    @Override
    public int getETA() {
        System.out.println("Calculating ETA (Transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Transit)");
        return 3;
    }
}
