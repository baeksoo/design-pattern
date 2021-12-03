package com.example.demo.creation.factory.method;

public class FactoryMethodClient {
    public static void main(final String[] args) {
        final HyundaiMotorFactory factory = new HyundaiMotorFactoryImpl();
        final Car car = factory.create("Sonata", "white", 1);
        System.out.println(car.getClass());
    }
}
