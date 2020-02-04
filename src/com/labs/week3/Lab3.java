package com.labs.week3;

public class Lab3 {
    public static void main(String[] args) {
        printMax(2, 2, 10);
    }

    public static int printMax(int num1, int num2, int printValue) {
        if (num1 > num2) {
            for(int i = 0; i < printValue; i++) {
                System.out.println(num1);
            }

            return num1;
        } else {
            for(int i = 0; i < printValue; i++) {
                System.out.println(num2);
            }

            return num2;
        }
    }
}
