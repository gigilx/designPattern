package com.lx.princples.DependenceInversion.after;

import com.lx.princples.DependenceInversion.before.IntelCPU;
import com.lx.princples.DependenceInversion.before.Kingstonmemory;

public class Computer {
    private CPU cpu;
    private Memory memory;

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public CPU getCPU() {
        return cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void run() {
        memory.save("data");
        System.out.println(memory.read());
        cpu.calc();
        System.out.println("运行结束");
    }
}
