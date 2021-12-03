package com.example.demo.behavior.templatecallback;

public class Calculator {

    public int execute(final Operator operator, final int left, final int right) {
        return operator.getResult(left, right);
    }
}
