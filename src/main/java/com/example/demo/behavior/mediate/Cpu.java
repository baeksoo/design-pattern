package com.example.demo.behavior.mediate;

public class Cpu {

    private final MainBoard computer;

    public Cpu(final MainBoard computer) {this.computer = computer;}

    public void start() {
        System.out.println("cpu start");
    }
    public void shutdown() { System.out.println("cpu down");}
    public void interrupt() { computer.shutDownComputer(); }
}
