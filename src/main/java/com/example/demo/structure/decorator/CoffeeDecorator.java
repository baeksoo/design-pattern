package com.example.demo.structure.decorator;

public class CoffeeDecorator implements Cafe {

    private Cafe cafe;

    public CoffeeDecorator(final Cafe cafe) {this.cafe = cafe;}

    @Override
    public void getCoffee() {
        cafe.getCoffee();
    }
}
