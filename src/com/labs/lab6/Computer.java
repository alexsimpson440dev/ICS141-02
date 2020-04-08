package com.labs.lab6;

public class Computer {
    private String os;
    private String material;
    private double cost;

    public Computer() {

    }

    public Computer(String os, String material, double cost) {
        this.os = os;
        this.material = material;
        this.cost = cost;
    }

    public String toString() {
        return "OS: " + this.os + "\nMaterial: " + this.material + "\nCost: " + this.cost;
    }
}
