package com.assignments.week1;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in a temperature, in celsius, to be converted to fahrenheit: ");
        double celsiusTemp = input.nextDouble();

        System.out.println((celsiusTemp*9/5)+32);
    }
}
