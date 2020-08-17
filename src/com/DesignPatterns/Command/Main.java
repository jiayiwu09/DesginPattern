package com.DesignPatterns.Command;

import com.DesignPatterns.Command.FX.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var commands = new CompositeCommand();
        commands.add(new ResizeCommand());
        commands.add(new BlackAndWhiteCommand());
        commands.execute();
    }
}
