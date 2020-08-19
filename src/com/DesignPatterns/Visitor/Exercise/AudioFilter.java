package com.DesignPatterns.Visitor.Exercise;

public interface AudioFilter {
    void apply(FactSegment segment);
    void apply(FormatSegment segment);
}
