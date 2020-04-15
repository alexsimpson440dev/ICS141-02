package com.exercises.exercise8;

public class Apple extends Fruit {
    private String type;

    public Apple(String color, double weightOz, int calories, String type) {
        super(color, weightOz, calories);
        this.type = type;
    }

    public void printColor() {
        System.out.println(super.getColor());
    }
}
