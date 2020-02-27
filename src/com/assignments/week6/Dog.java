package com.assignments.week6;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, String breed, int age) {
        super(name, "Dog", age);
        this.breed = breed;
    }

    public void print() {
        super.print();
        System.out.println("Breed: " + this.breed);
    }
}
