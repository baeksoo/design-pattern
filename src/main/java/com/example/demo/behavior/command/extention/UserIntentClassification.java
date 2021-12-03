package com.example.demo.behavior.command.extention;

import java.util.List;

public class UserIntentClassification {
    private final List<Command> commands;

    public UserIntentClassification(final List<Command> commands) {this.commands = commands;}

    public void tvCommandByIntent(final String intent) {
        for (final Command command : commands) {
            if (command.isExecutableIntent(intent)) {
                command.execute();
                break;
            }
        }
    }
}
