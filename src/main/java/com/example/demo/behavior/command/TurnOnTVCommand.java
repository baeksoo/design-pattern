package com.example.demo.behavior.command;

public class TurnOnTVCommand implements Command {

    private final Television television;

    public TurnOnTVCommand(final Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
