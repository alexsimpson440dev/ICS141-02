package com.exercises.week3;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(multiplyValues(1, 5));
        System.out.println(multiplyValues(1, 5, 8));

    }

    public static double multiplyValues(double val1, double val2) {
        return val1 * val2;
    }

    public static double multiplyValues(double val1, double val2, double val3) {
        return val1 * val2 * val3;
    }
}
