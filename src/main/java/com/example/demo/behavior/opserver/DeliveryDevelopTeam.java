package com.example.demo.behavior.opserver;

public class DeliveryDevelopTeam implements DevelopTeam {

    @Override
    public void replyToServiceCenter(final String message) {
        if (message.contains("배송"))
            System.out.println("배송팀 처리 가능");
        else
            System.out.println("배송팀 처리 불가능");
    }
}
