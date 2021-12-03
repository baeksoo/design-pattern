package com.example.demo.structure.decorator;

public class Coffee implements Cafe {
    @Override
    public void getCoffee() {
        System.out.println("Coffee order");
    }
}
