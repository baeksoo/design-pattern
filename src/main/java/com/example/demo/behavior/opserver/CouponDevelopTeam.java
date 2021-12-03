package com.example.demo.behavior.opserver;

public class CouponDevelopTeam implements DevelopTeam {

    @Override
    public void replyToServiceCenter(String message) {
        if (message.contains("쿠폰"))
            System.out.println("쿠폰팀 처리 가능");
        else
            System.out.println("쿠폰팀 처리 불가능");
    }
}
