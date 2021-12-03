package com.example.demo.creation.factory.abs;

public class SonataFactory implements CarFactory {
    @Override
    public Car create(final String color, final int option) {
        return new Sonata(color, option);
    }
}
