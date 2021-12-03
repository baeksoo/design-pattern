package com.example.demo.structure.bridge;

public class BridgeClient {
    public static void main(String[] args) {
        final Car car = new HyundaiCar(new SedanController());
        car.moveFront();
    }
}
