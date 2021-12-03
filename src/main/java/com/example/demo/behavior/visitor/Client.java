package com.example.demo.behavior.visitor;

public class Client {
    public static void main(final String[] args) {
        final Store lotte = new LotteStore();
        final Object food = new Food("딸기");

        food.accept(lotte);
    }
}
