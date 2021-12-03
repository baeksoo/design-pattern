package com.example.demo.creation.factory.abs;

public class FactoryClient {
    public static void main(final String[] args) {
        final HyundaiMotorFactory factory = new HyundaiMotorFactoryImpl(new AvanteFactory());
        final Car car = factory.create("white", 1);
        System.out.println(car.getClass());
    }
}
