package com.lx.princples.DependenceInversion.before;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        IntelCPU cpu = new IntelCPU();
        Kingstonmemory memory = new Kingstonmemory();
        computer.setIntelCPU(cpu);
        computer.setKingstonmemory(memory);
        computer.run();
    }
}
