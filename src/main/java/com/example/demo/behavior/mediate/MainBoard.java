package com.example.demo.behavior.mediate;

public class MainBoard { // concreteMediator
    private Cpu cpu; // Colleague A
    private Memory memory; // Colleague B
    private Disk disk; // Colleague C
                       // ..Colleague 추가 가능.

    public MainBoard(final Cpu cpu, final Memory memory, final Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void startComputer() {
        cpu.start();
        memory.start();
        disk.start();
    }

    public void shutDownComputer() {
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }
}
