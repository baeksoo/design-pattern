package com.example.demo.behavior.opserver;

public class Client {
    public static void main(String[] args) {
        final ServiceCenter serviceCenter = new ElevenServiceCenter();
        serviceCenter.addDevelopTeam(new CouponDevelopTeam());
        serviceCenter.addDevelopTeam(new DeliveryDevelopTeam());
        serviceCenter.addDevelopTeam(new OrderDevelopTeam());

        serviceCenter.questionToDevelopTeam("쿠폰이 이상해요");
    }
}
