package com.exercises.week1;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1: First, the white space is different when defining the variables
        // Second, the defined integer VAL1 should be lowercase as this is closer to a constant naming convention

        // 2:
        System.out.println("Integer 1:");
        int userInputInt1 = input.nextInt();
        System.out.println("Integer 2:");
        int userInputInt2 = input.nextInt();
        System.out.println("Integer 3:");
        int userInputInt3 = input.nextInt();

        int multipliedIntegers = userInputInt1 * userInputInt2;
        int finalResult = multipliedIntegers - userInputInt3;

        System.out.println("The final result is: " + finalResult);

        // 3:
        // get user input 1 and set to input1
        // get user input 2 and set to input2
        // get user input 3 and set to input3
        // if input1 > input2
            // if input1 > input3
                // print input1
        // if input2 > input3
            // print input2
        // else
            // print input3

        if (userInputInt1 > userInputInt2 && userInputInt1 > userInputInt3) {
            System.out.println("The highest input is: " + userInputInt1);
        }

        else if (userInputInt2 > userInputInt3) {
            System.out.println("The highest input is: " + userInputInt2);
        }

        else {
            System.out.println("The highest input is: " + userInputInt3);
        }
    }
}
