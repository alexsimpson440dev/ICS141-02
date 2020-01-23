/* Created by: Alexander Simpson 1/22/2020
   Class: ICS141-02
*/
package com.assignments.week2;
import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X_MAX, X_MIN, Y_MAX, Y_MIN;
        X_MAX = 10;
        X_MIN = -10;
        Y_MAX = 7.5;
        Y_MIN = -7.5;

        System.out.print("Enter in an x value: ");
        double userXVal = input.nextDouble();
        System.out.print("Enter in a y value: ");
        double userYVal = input.nextDouble();

        if (userXVal > X_MAX || userXVal < X_MIN || userYVal > Y_MAX || userYVal < Y_MIN) {
            System.out.println("Point (" +userXVal+", "+userYVal+") is out of the Rectangle.");
        }
        // else if for X_MAX corners
        else if (userXVal == X_MAX && (userYVal == Y_MAX || userYVal == Y_MIN)) {
            System.out.println("Point (" +userXVal+", "+userYVal+") is on a corner of the Rectangle.");
        }
        // else if for X_MIN corners
        else if (userXVal == X_MIN && (userYVal == Y_MAX || userYVal == Y_MIN)) {
            System.out.println("Point (" +userXVal+", "+userYVal+") is on a corner of the Rectangle.");
        }
        else if (userXVal >= X_MAX || userXVal <= X_MIN || userYVal >= Y_MAX || userYVal <= Y_MIN) {
            System.out.println("Point (" +userXVal+", "+userYVal+") is on the border of the Rectangle.");
        }
        else {
            System.out.println("Point (" +userXVal+", "+userYVal+") is within the Rectangle.");
        }
    }
}
