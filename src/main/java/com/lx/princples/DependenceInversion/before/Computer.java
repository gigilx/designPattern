package com.lx.princples.DependenceInversion.before;

public class Computer {
    private IntelCPU intelCPU;
    private Kingstonmemory kingstonmemory;

    public void setIntelCPU(IntelCPU cpu) {
        this.intelCPU = cpu;
    }

    public void setKingstonmemory(Kingstonmemory memory) {
        this.kingstonmemory = memory;
    }

    public IntelCPU getCPU() {
        return intelCPU;
    }

    public Kingstonmemory getMemory() {
        return kingstonmemory;
    }

    public void run() {
        kingstonmemory.save("data");
        System.out.println(kingstonmemory.read());
        intelCPU.calc();
        System.out.println("运行结束");
    }
}
