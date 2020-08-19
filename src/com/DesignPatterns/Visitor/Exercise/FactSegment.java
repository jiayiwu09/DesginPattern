package com.DesignPatterns.Visitor.Exercise;

public class FactSegment extends Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
