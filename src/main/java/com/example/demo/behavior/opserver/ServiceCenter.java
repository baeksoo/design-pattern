package com.example.demo.behavior.opserver;

public interface ServiceCenter {

    void addDevelopTeam(DevelopTeam team); // subscribe

    void deleteDevelopTeam(DevelopTeam team); // unsubscribe

    void questionToDevelopTeam(String question);
}
