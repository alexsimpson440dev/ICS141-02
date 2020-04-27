package com.labs.lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        boolean loopControl = true;

        while(loopControl) {
            try {
                Scanner scanner = new Scanner(System.in);
                double woodLength;
                int piecesToCut;

                System.out.print("Input length of wood needed to be cut in inches: ");
                woodLength = scanner.nextDouble();
                System.out.print("Amount of pieces needed: ");
                piecesToCut = scanner.nextInt();

                if (woodLength == 0 || piecesToCut == 0) {
                    throw new ArithmeticException();
                }

                if (woodLength < 0 || piecesToCut < 0) {
                    throw new IllegalArgumentException();
                }

                double woodPieceLength = woodLength / piecesToCut;
                System.out.println("\nPieces cut: " + piecesToCut + "\nLength of each piece: " + woodPieceLength + "\"");
                scanner.close();
                loopControl = false;

            } catch (InputMismatchException ex) {
                System.out.println("Bad input given!");
            } catch (ArithmeticException ex) {
                System.out.println("Wood length and amount of pieces cannot be 0.");
            } catch (IllegalArgumentException ex) {
                System.out.println("Wood length and amount of pieces cannot be negative");
            }
        }
    }
}
