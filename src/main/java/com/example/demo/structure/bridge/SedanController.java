package com.example.demo.structure.bridge;

public class SedanController implements CarController{
    @Override
    public void moveFront() {
        System.out.println("sedan move front");
    }

    @Override
    public void moveRear() {
        System.out.println("sedan move rear");
    }

    @Override
    public void moveRight() {
        System.out.println("sedan move right");
    }

    @Override
    public void moveLeft() {
        System.out.println("sedan move left");
    }
}
