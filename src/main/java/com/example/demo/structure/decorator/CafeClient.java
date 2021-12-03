package com.example.demo.structure.decorator;

public class CafeClient {

    public static void main(String[] args) {
        boolean isNeedIce = true;
        boolean isNeedCream = true;

        Cafe cafe = new Coffee();
        if (isNeedCream) // wrapping
            cafe = new CoffeeCreamDecorator(cafe);

        if (isNeedIce)  // wrapping
            cafe = new CoffeeIceDecorator(cafe);

        cafe.getCoffee();
    }
}
