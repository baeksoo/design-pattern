package com.example.demo.behavior.command.extention;

import java.util.List;

public class CommandClient {

    public static void main(String[] args) {
        UserIntentClassification user = new UserIntentClassification(List.of(new TurnOnTVCommand(new Television()),
                                                                             new TurnOffTVCommand(new Television())));

        user.tvCommandByIntent("티비 꺼줘");
    }
}
