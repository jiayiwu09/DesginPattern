package com.DesignPatterns.Decorator.Exercise;

public class Artefact implements IArtefact{
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
