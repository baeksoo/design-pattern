package com.example.demo.behavior.command;

public class User {
    private final Command command;

    public User(final Command command) {
        this.command = command;
    }

    void executeCommand() {
        command.execute();
    }
}
