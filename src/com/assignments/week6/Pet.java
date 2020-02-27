package com.assignments.week6;

public class Pet {
    private String name;
    private String petType;
    private int age;

    public Pet() {

    }

    public Pet(String name, String petType, int age) {
        this.name = name;
        this.petType = petType;
        this.age = age;
    }

    public void print() {
        String temp = "";

        temp += "Name: " + this.name + "\n";
        temp += "Pet Type: " + this.petType + "\n";
        temp += "Age: " + this.age;

        System.out.println(temp);
    }
}
