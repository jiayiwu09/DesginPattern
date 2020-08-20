package com.DesignPatterns.Decorator.Exercise;

public class ErrorDecorator implements IArtefact{
    private IArtefact artefact;

    public ErrorDecorator(IArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Error]";
    }
}
