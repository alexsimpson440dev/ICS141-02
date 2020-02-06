package com.exercises.week4;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int t = 0; t < matrix[i].length; t++) {
                matrix[i][t] = (int) Math.round(Math.random()*100);
                System.out.print(matrix[i][t] + " ");
            }
        }
    }
}
