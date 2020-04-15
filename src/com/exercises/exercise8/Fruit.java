package com.exercises.exercise8;

public abstract class Fruit {

    private String color;
    private double weightOz;
    private int calories;

    public Fruit(String color, double weightOz, int calories) {
        this.color = color;
        this.weightOz = weightOz;
        this.calories = calories;
    }

    public String getColor() {
        return color;
    }

    public double getWeightOz() {
        return weightOz;
    }

    public int getCalories() {
        return calories;
    }

    public abstract void printColor();
}
