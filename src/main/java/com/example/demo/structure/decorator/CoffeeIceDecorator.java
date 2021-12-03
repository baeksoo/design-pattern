package com.example.demo.structure.decorator;

public class CoffeeIceDecorator extends CoffeeDecorator {
    public CoffeeIceDecorator(final Cafe cafe) {
        super(cafe);
    }

    @Override
    public void getCoffee() {
        addIce();
        super.getCoffee();
    }

    private void addIce() {
        System.out.println("add Ice");
    }
}
