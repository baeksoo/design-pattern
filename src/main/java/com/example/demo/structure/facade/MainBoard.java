package com.example.demo.structure.facade;

public class MainBoard {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

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
}
