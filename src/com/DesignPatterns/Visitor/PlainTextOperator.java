package com.DesignPatterns.Visitor;

public class PlainTextOperator implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("text - heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("text - anchor");
    }
}
