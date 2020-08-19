package com.DesignPatterns.Visitor.Exercise;

public class ReverbFilter implements AudioFilter{

    @Override
    public void apply(FactSegment segment) {
        System.out.println("ReverbFilter - FactSegment");
    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("ReverbFilter - FormatSegment");
    }
}
