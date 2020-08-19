package com.DesignPatterns.Visitor.Exercise;

public class NormalizeFilter implements AudioFilter{
    @Override
    public void apply(FactSegment segment) {
        System.out.println("NormalizeFilter - FactSegment");
    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("NormalizeFilter - FormatSegment");
    }
}
