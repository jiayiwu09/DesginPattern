package com.DesignPatterns.Command.Editor;

import java.util.ArrayDeque;
import java.util.Deque;

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
