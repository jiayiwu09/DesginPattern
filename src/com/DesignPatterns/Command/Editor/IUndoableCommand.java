package com.DesignPatterns.Command.Editor;

public interface IUndoableCommand extends ICommand{
    void unexecute();
}
