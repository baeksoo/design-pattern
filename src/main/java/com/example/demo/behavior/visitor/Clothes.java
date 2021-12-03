package com.example.demo.behavior.visitor;

public class Clothes implements Object {
    private final String name;

    public Clothes(final String name) {this.name = name;}

    @Override
    public void accept(final Store store) {
        store.getProductAndPrintName(this);
    }

    public String getName() {
        return name;
    }
}
