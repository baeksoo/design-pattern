package com.example.demo.behavior.mediate;

public class Memory {

    private final MainBoard computer;

    public Memory(final MainBoard computer) {this.computer = computer;}

    public void start() {
        System.out.println("memory start");
    }
    public void shutdown() { System.out.println("memory down");}
    public void interrupt() { computer.shutDownComputer(); }
}
