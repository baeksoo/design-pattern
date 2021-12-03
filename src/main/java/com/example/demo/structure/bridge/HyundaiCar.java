package com.example.demo.structure.bridge;

public class HyundaiCar implements Car {

    private final CarController controller;

    public HyundaiCar(final CarController controller) {
        this.controller = controller;
    }

    @Override
    public void moveFront() {
        controller.moveFront();
    }

    @Override
    public void moveRear() {
        controller.moveRear();
    }

    @Override
    public void moveRight() {
        controller.moveRight();
    }

    @Override
    public void moveLeft() {
        controller.moveLeft();
    }
}
