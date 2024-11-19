package com.lx.pattern.create.builder.extend;

public class Computer {
    private String cpu;
    private String memory;
    private String mainboard;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    public static final class Builder{
        private String cpu;
        private String memory;
        private String mainboard;

        public Builder() {
        }

        public Builder  cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}
