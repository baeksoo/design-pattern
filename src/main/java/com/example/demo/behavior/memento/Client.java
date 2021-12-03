package com.example.demo.behavior.memento;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(final String[] args) {
        final List<ClipBoardText> momentos = new ArrayList<>(); // Caretaker

        final ClipBoard clipBoard = new ClipBoard();
        clipBoard.setText("Status 1");
        momentos.add(clipBoard.save());

        clipBoard.setText("status 2");
        clipBoard.setText("status 3");
        momentos.add(clipBoard.save()); // memento create

        for(final ClipBoardText text : momentos) {
            clipBoard.load(text); // restore
            System.out.println(clipBoard.getText());
        }
    }
}
