package com.example.demo.structure.composit;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements Component {

    List<Component> components = new ArrayList<>();

    @Override
    public void print() {
        for (final Component component : components) {
            component.print();
        }
    }

    public void addComponent(final Component component) {
        components.add(component);
    }
}
