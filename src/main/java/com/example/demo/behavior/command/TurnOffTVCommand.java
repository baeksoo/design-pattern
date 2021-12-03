package com.example.demo.behavior.command;

public class TurnOffTVCommand implements Command {

    private final Television television;

    public TurnOffTVCommand(final Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
