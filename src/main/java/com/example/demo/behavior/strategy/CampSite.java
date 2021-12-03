package com.example.demo.behavior.strategy;

public class CampSite {

    private final Strategy strategy;

    public CampSite(final Strategy payStrategy) {this.strategy = payStrategy;}

    public void getPaymentForRent(final int days) { // operation
        strategy.getPaymentForRent(days);
    }
}
