package com.example.demo.behavior.command;

public class CommandClient {

    public static void main(final String[] args) {
        final User user = new User(new TurnOnTVCommand(new Television()));
        user.executeCommand();
    }
}
