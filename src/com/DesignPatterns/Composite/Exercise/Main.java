package com.DesignPatterns.Composite.Exercise;

public class Main {
    public static void main(String[] args) {
        var team1 = new Team();
        team1.add(new Truck());
        team1.add(new Human());

        var team2 = new Team();
        team2.add(new Truck());
        team2.add(new Truck());
        team2.add(new Human());

        var team = new Team();
        team.add(team1);
        team.add(team2);
        team.deploy();
    }
}
