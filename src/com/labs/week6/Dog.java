package com.labs.week6;

public class Dog {

    private String name;
    private int age;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        String temp = "";

        temp += "Name: " + name + "\n";
        temp += "Age: " + age + "\n";

        return temp;
    }

    public static void main(String[] args) {
        Husky h1 = new Husky("Revali", 4);
        System.out.println(h1.toString());

        Yorkie y1 = new Yorkie("Jeff", 16);
        System.out.println(y1.toString());
    }
}
