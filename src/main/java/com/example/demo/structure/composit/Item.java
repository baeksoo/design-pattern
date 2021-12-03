package com.example.demo.structure.composit;

public class Item implements Component {
    private final String name;

    public Item(final String name) {this.name = name;}

    @Override
    public void print() {
        System.out.println(name);
    }
}
