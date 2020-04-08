package com.labs.lab6;

public class Brand extends Computer {
    private String make;
    private String model;

    public Brand() {

    }

    public Brand(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Brand(String make, String model, String os, String material, double cost) {
        super(os, material, cost);
        this.make = make;
        this.model = model;
    }

    public String toString() {
        return "Make: " + this.make + "\nModel: " + this.model;
    }
}
