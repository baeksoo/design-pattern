package com.example.demo.behavior.command.extention;

public class TurnOnTVCommand implements Command {

    private final Television television;

    public TurnOnTVCommand(final Television television) {
        this.television = television;
    }

    @Override
    public boolean isExecutableIntent(final String intent) {
        return intent.matches(".*(티비|TV).*켜.*");
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
