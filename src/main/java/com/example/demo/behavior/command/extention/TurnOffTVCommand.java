package com.example.demo.behavior.command.extention;

public class TurnOffTVCommand implements Command {

    private final Television television;

    public TurnOffTVCommand(final Television television) {
        this.television = television;
    }

    @Override
    public boolean isExecutableIntent(final String intent) {
        return intent.matches(".*(티비|TV).*꺼.*");
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
