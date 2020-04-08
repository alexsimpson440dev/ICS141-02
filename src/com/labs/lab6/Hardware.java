package com.labs.lab6;

public class Hardware extends Brand {
    private String processor;
    private String gpu;
    private int ram;

    public Hardware() {

    }

    public Hardware(String processor, String gpu, int ram, String make, String model) {
        super(make, model);
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }
}
