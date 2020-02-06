package com.exercises.week4;

public class Computer {
    private String brand;
    private int totalRam;
    private int totalStorage;
    private double processorSpeed;

    public Computer() {

    }

    public Computer(String brnd, int ttlRam, int ttlStorage, double cpuSpeed) {
        brand = brnd;
        totalRam = ttlRam;
        totalStorage = ttlStorage;
        processorSpeed = cpuSpeed;
    }

    public void displayComputerInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Total Memory: " + totalRam + "GB");
        System.out.println("Total Storage: " + totalStorage + "GB");
        System.out.println("Processor Speed: " + processorSpeed + "Ghz");

    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("HP", 16, 256, 3.6);
        computer1.displayComputerInfo();
    }
}
