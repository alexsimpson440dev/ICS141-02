package com.exercises.week7;

public class Cat extends Animal {

    private String breed;

    public Cat() {

    }

    public Cat(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    // by using the super class, animal, we can override its toString() method
    public String toString() {
        return super.toString() + "Breed: " + breed + "\n";
    }
}
