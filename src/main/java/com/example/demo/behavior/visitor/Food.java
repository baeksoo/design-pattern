package com.example.demo.behavior.visitor;

public class Food implements Object {
    private final String name;

    public Food(final String name) {this.name = name;}

    @Override
    public void accept(final Store store) {
        store.getProductAndPrintName(this);
    }

    public String getName() {
        return name;
    }
}
