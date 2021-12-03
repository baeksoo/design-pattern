package com.example.demo.creation.factory.abs;

public class HyundaiMotorFactoryImpl implements HyundaiMotorFactory {

    private final CarFactory carFactory;

    public HyundaiMotorFactoryImpl(final CarFactory carFactory) {this.carFactory = carFactory;}

    @Override
    public Car create(final String color, final int option) {
        return carFactory.create(color, option);
    }
}
