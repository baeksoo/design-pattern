package com.example.demo.creation.factory.abs;

public class AvanteFactory implements CarFactory{
    @Override
    public Car create(final String color, final int option) {
        return new Avante(color, option);
    }
}
