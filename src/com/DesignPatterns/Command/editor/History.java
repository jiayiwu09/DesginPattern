package com.DesignPatterns.Command.editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private Deque<IUndoableCommand> commands = new ArrayDeque<>();

    public void push(IUndoableCommand command) {
        commands.add(command);
    }

    public IUndoableCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
