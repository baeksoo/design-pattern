package com.example.demo.behavior.templatemethod;

public abstract class Calculator {

    public int execute(int left, int right) {
        return getResult(left, right);
    }

    protected abstract int getResult(final int left, final int right);
}
