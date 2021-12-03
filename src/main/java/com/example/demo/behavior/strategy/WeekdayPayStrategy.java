package com.example.demo.behavior.strategy;

public class WeekdayPayStrategy implements Strategy {
    @Override
    public void getPaymentForRent(final int days) {
        System.out.println(days * 10000);
    }
}
