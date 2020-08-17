package com.DesignPatterns.Command;

import com.DesignPatterns.Command.FX.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resizing");
    }
}
