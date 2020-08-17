package com.DesignPatterns.Command.editor;

public interface IUndoableCommand extends ICommand{
    void unexecute();
}
