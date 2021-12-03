package com.example.demo.structure.decorator;

public class CoffeeCreamDecorator extends CoffeeDecorator {
    public CoffeeCreamDecorator(final Cafe cafe) {
        super(cafe);
    }

    @Override
    public void getCoffee() {
        addCream();
        super.getCoffee();
    }

    private void addCream() {
        System.out.println("add Cream");
    }
}
