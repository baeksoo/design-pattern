package com.example.demo.behavior.strategy;

public class WeekendPayStrategy implements Strategy {
    @Override
    public void getPaymentForRent(final int days) {
        System.out.println(days * 50000);
    }
}
