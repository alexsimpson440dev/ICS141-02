package com.assignments.assignment8;

public class Factorials {
    public static void main(String[] args) {
        System.out.println("For loop factorial: " + forLoopFactorial(4));
        System.out.println("Recursion factorial: " + recursiveFactorial(4));
    }

    public static int forLoopFactorial(int value) {
        int factorial = value;
        for(int i = value; i > 1; i--) {
            factorial *= (i-1);
        }

        return factorial;
    }

    public static int recursiveFactorial(int value) {
        if(value > 1) {
            return value * recursiveFactorial(value-1);
        } else {
            return 1;
        }
    }
}
