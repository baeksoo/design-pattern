package com.example.demo.behavior.mediate;

public class Disk {
    private final MainBoard computer;

    public Disk(final MainBoard computer) {this.computer = computer;}

    public void start() {
        System.out.println("disk start");
    }
    public void shutdown() { System.out.println("disk down");}
    public void interrupt() { computer.shutDownComputer(); }
}
