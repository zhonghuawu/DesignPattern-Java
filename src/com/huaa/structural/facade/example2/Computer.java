package com.huaa.structural.facade.example2;

public class Computer {
    CPU cpu;
    Disk disk;
    Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start() {
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("computer start");
    }

    public void shutdown() {
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("computer shutdown");
    }
}
