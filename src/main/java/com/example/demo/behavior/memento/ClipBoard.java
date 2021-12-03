package com.example.demo.behavior.memento;


public class ClipBoard { // Originator

    private String text;

    public ClipBoardText save() {
        return new ClipBoardText(text);
    }

    public void load(final ClipBoardText clipBoardText) {
        this.text = clipBoardText.getSavedText();
    }

    public void setText(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
