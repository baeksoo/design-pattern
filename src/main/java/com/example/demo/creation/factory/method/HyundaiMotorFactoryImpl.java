package com.example.demo.creation.factory.method;

public class HyundaiMotorFactoryImpl implements HyundaiMotorFactory {
    @Override
    public Car create(final String name, final String color, final int option) {
        if ("Sonata".equalsIgnoreCase(name)) {
            return new Sonata(color, option);
        }
        if ("Avante".equalsIgnoreCase(name)) {
            return new Avante(color, option);
        }
        throw new IllegalArgumentException(name + " is can't make this factory");
    }
}
