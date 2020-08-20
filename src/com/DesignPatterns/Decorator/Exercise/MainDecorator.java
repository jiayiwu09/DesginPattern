package com.DesignPatterns.Decorator.Exercise;

public class MainDecorator implements IArtefact{
    private IArtefact artefact;

    public MainDecorator(IArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Main]";
    }
}
