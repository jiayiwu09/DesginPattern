package com.DesignPatterns.Visitor.Exercise;

public class FormatSegment extends Segment{
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
