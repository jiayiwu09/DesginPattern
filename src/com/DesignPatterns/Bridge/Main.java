package com.DesignPatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }
}
