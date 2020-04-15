package com.labs.lab7;

public abstract class Vehicle {
    private String extColor;
    private String name;
    private int year;

    public abstract void printColor();
    public abstract void printVehicleInformation();

    protected Vehicle(String extColor, String name, int year) {
        this.extColor = extColor;
        this.name = name;
        this.year = year;
    }

    public String getExtColor() {
        return extColor;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

}
