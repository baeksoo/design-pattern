package com.example.demo.behavior.memento;

public class ClipBoardText { // Memento

    private final String savedText;

    public ClipBoardText(final String text) {
        this.savedText = text;
    }

    public String getSavedText() {
        return savedText;
    }
}
