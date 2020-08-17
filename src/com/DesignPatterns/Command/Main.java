package com.DesignPatterns.Command;

import com.DesignPatterns.Command.FX.Button;
import com.DesignPatterns.Command.Editor.BoldCommand;
import com.DesignPatterns.Command.Editor.History;
import com.DesignPatterns.Command.Editor.HtmlDocument;
import com.DesignPatterns.Command.Editor.UndoCommand;

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

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        boldCommand.unexecute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
