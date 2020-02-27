package com.labs.week6;

public class Husky extends Dog {

    public Husky(String name, int age) {
        super(name, age);
    }

    public String toString() {
        String temp = "Husky Data\n";

        temp += super.toString();

        return temp;
    }
}
