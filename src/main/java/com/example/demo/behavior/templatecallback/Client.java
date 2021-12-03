package com.example.demo.behavior.templatecallback;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.execute(new Operator() {
            @Override
            public int getResult(final int left, final int right) {
                return left + right;
            }
        }, 1, 2));

        System.out.println(calculator.execute((left, right) -> left * right, 2, 4));
    }
}
