package com.exercises.week6;

public class Student {

    private String name;
    private String id;
    private String major;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public void printStudent() {
        System.out.println("Name: " + name + "; ID: " + id + "; Major: " + major);
    }
}
