package com.DesignPatterns.Command;

import com.DesignPatterns.Command.FX.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
