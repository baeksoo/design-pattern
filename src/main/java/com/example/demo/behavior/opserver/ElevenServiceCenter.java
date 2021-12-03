package com.example.demo.behavior.opserver;

import java.util.HashSet;
import java.util.Set;

public class ElevenServiceCenter implements ServiceCenter {
    private final Set<DevelopTeam> developTeams = new HashSet<>(); // Observers

    @Override
    public void addDevelopTeam(final DevelopTeam team) {
        developTeams.add(team);
    } // subscribe

    @Override
    public void deleteDevelopTeam(final DevelopTeam team) { developTeams.remove(team);} // unsubscribe

    @Override
    public void questionToDevelopTeam(final String question) { // notify
        for (final DevelopTeam developTeam : developTeams) developTeam.replyToServiceCenter(question);
    }
}
