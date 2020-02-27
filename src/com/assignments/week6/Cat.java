package com.assignments.week6;

public class Cat extends Pet {
    private String breed;

    public Cat(String name, String breed, int age) {
        super(name, "Cat", age);
        this.breed = breed;
    }

    public void print() {
        super.print();
        System.out.println("Breed: " + this.breed);
    }
}
