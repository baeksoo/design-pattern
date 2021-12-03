package com.example.demo.structure.bridge;

public class SuvController implements CarController{
    @Override
    public void moveFront() {
        System.out.println("SUV move front");
    }

    @Override
    public void moveRear() {
        System.out.println("SUV move rear");
    }

    @Override
    public void moveRight() {
        System.out.println("SUV move right");
    }

    @Override
    public void moveLeft() {
        System.out.println("SUV move left");
    }
}
