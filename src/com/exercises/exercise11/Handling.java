package com.exercises.exercise11;
import java.util.Scanner;

public class Handling {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] array = {11, 33, 55, 77, 99, 22, 44, 66, 88, 10};
//
//        // Prompt the user to enter an array spot [0-9]
//        System.out.print("Enter a spot in the array and I will return the value. [0-9]: ");
//        int index = input.nextInt();
//
//        if(index >= 0 && index <= 9) {
//            System.out.println("Your value at index " + index + " is " + +array[index] + "!");
//        } else {
//            System.out.println("Bad index!");
//        }
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {11, 33, 55, 77, 99, 22, 44, 66, 88, 10};

        // Prompt the user to enter an array spot [0-9]
        System.out.print("Enter a spot in the array and I will return the value. [0-9]: ");
        int index = input.nextInt();

        try {
            System.out.println("Your value at index " + index + " is " + +array[index] + "!");
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Bad index!");
        }
    }

    // B. ArrayIndexOutOfBoundsException
    // E. NullPointerException
    // B. The program displays Welcome to Java two times followed by End of the block.
}
