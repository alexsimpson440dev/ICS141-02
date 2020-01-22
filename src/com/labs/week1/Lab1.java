package com.labs.week1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // simple program to add and average users input
        System.out.print("Enter in your first number: ");
        double userInput1 = input.nextInt();
        System.out.print("Enter in your second number: ");
        double userInput2 = input.nextInt();
        System.out.print("Enter in your last number: ");
        double userInput3 = input.nextInt();

        // quick math
        double sumOfUserInputs = userInput1 + userInput2 + userInput3;
        double averageOfUserInputs = sumOfUserInputs / 3;

        // output
        System.out.println("Sum of inputs: " + sumOfUserInputs);
        System.out.println("Average of inputs: " + averageOfUserInputs);
    }
}
