package com.lx.princples.DependenceInversion.after;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        IntelCPU cpu = new IntelCPU();
        Kingstonmemory memory = new Kingstonmemory();
        computer.setCPU(cpu);
        computer.setMemory(memory);
        computer.run();
    }
}
