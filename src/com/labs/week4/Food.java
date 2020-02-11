package com.labs.week4;

public class Food {
    private String foodName;
    private String foodType;
    private int calories;

    public Food() {

    }

    public Food(String foodNameInput, String foodTypeInput, int caloriesInput) {
        foodName = foodNameInput;
        foodType = foodTypeInput;
        calories = caloriesInput;
    }

    public void displayFood() {
        System.out.println(foodName + " is a " + foodType + " and it has " + calories + " calories.");
    }
}
