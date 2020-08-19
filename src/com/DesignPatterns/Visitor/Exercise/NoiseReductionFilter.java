package com.DesignPatterns.Visitor.Exercise;

public class NoiseReductionFilter implements AudioFilter{
    @Override
    public void apply(FactSegment segment) {
        System.out.println("Noise Reduction - FactSegment");
    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Noise Reduction - FormatSegment");
    }
}
