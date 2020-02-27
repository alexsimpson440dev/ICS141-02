package com.assignments.week3;

public class Assignment3 {
    public static void main(String[] args) {
        statsDisplay(createArray());
    }

    public static int[] createArray() {
        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }

        return arr;
    }

    public static void statsDisplay(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        int one = 1;
        double total = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            total += arr[i];
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Average of all numbers: " + (total/arr.length));
    }
}
