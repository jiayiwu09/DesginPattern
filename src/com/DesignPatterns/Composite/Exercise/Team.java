package com.DesignPatterns.Composite.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component{
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void deploy() {
        components.forEach(s -> s.deploy());
    }
}
