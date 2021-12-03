package com.example.demo.behavior.opserver;

public class OrderDevelopTeam implements DevelopTeam {

    @Override
    public void replyToServiceCenter(final String message) {
        if (message.contains("주문"))
            System.out.println("주문팀 처리 가능");
        else
            System.out.println("주문팀 처리 불가능");
    }
}
