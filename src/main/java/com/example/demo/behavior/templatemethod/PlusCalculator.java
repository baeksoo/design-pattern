package com.example.demo.behavior.templatemethod;

public class PlusCalculator extends Calculator {
    @Override
    protected int getResult(final int left, final int right) {
        return left + right;
    }
}
