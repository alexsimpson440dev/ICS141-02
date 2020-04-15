package com.labs.lab7;

public class Car extends Vehicle {
    private int maxMPH;
    private String intColor;

    public Car(String extColor, String name, int year, int maxMPH, String intColor) {
        super(extColor, name, year);
        this.maxMPH = maxMPH;
        this.intColor = intColor;
    }

    public void printColor() {
        System.out.println("Exterior Color: " + super.getExtColor());
        System.out.println("Interior Color: " + this.intColor);
    }

    public void printVehicleInformation() {
        System.out.println("Vehicle Name: " + super.getName());
        System.out.println("Year Manufactured: " + super.getYear());
        System.out.println("Max MPH: " + this.maxMPH);
    }
}
