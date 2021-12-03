package com.example.demo.behavior.templatemethod;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new PlusCalculator();
        System.out.println(calculator.execute(1, 2));

        calculator = new MultiplyCalculator();
        System.out.println(calculator.execute(2, 4));
    }
}
