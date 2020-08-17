package com.DesignPatterns.State.Exercise;

public class Main {
    public static void main(String[] args) {
        var service = new DirectionService(new Bicycling());
        System.out.println(service.getETA());
        service.setTravelMode(new Walking());
        System.out.println(service.getDirection());
        service.setTravelMode(new Transit());
        System.out.println(service.getETA());
        service.setTravelMode(new Driving());
        System.out.println(service.getDirection());
    }
}
