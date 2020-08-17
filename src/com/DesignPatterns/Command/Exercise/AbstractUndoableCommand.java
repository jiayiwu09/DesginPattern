package com.DesignPatterns.Command.Exercise;

public abstract class AbstractUndoableCommand implements UndoableCommand{
    protected History history;
    protected VideoEditor videoEditor;

    public AbstractUndoableCommand(VideoEditor videoEditor, History history) {
        this.history = history;
        this.videoEditor = videoEditor;
    }


    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
