package com.labs.week2;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many values would you like to calculate? ");
        int userInputCount = input.nextInt();
        double total = 0;

        for (int i = 0; i < userInputCount; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            total += input.nextDouble();
        }

        System.out.println("The average of the numbers entered is: " + total/userInputCount);
    }
}
