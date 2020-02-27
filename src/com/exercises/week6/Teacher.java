package com.exercises.week6;

public class Teacher {

    private String name;
    private String id;

    public Teacher(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void printTeacher() {
        System.out.println(name);
        System.out.println(id);
    }
}
