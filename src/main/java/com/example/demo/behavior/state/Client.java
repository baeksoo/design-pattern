package com.example.demo.behavior.state;

public class Client {
    public static void main(final String[] args) {
        final Light light = new Light();
        light.on();
        light.on();
        light.off();
        light.off();
    }
}
