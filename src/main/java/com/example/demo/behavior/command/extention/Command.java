package com.example.demo.behavior.command.extention;

public interface Command {
    boolean isExecutableIntent(String intent);
    void execute();
}
