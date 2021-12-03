package com.example.demo.behavior.strategy;

public class Client {
    public static void main(final String[] args) {
        final CampSite campSite = new CampSite(new WeekdayPayStrategy());
        campSite.getPaymentForRent(3);

        final CampSite campSite1 = new CampSite(new WeekendPayStrategy());
        campSite1.getPaymentForRent(3);
    }
}
