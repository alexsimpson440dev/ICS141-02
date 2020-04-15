package com.exercises.exercise8;

public class Exercise8 {
    // ---------- PART A ----------
    // Question 1
        // C and D because Person and Object do not extend Student, Student extends from them
    // Question 2
        // C Protected because public is accessible anywhere, and private is accessible only in its class
    // Question 3
        // D because the default only allows within the package, C is close, but if the accessor is a subclass than it
        // can access protected methods

    // ---------- PART B ----------
    public static void main(String[] args) {
        Apple a1 = new Apple("red", 16.0, 75, "Red Delicious");
        a1.printColor();
    }
}
