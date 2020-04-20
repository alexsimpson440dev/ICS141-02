package com.labs.lab8;
import java.util.*;

public class Lab8 {
    public static void main(String[] args) {
        // part 1
        ArrayList<String> nouns = new ArrayList<String>(Arrays.asList(
                "dog", "cat", "dog", "bird", "animal"
        ));
        // [dog, cat, dog, bird, animal]
        nouns.remove("dog");
        // [cat, dog, bird, animal]
        nouns.add("dog");
        nouns.add("dog");
        // [cat, dog, bird, animal, dog, dog]
        nouns.remove(4);
        // [cat, dog, bird, animal, dog]
        nouns.add("cat");
        // [cat, dog, bird, animal, dog, cat]
        nouns.removeAll(Collections.singleton("cat"));
        // [dog, bird, animal, dog]
        System.out.println(nouns);

        // part 2
        readValues();
    }

    public static void readValues() {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<>();

        System.out.print("Please input an integer: ");
        int value = read.nextInt();

        while(value != -999) {
                userInput.add(value);
                System.out.println("Your values so far: " + userInput);
                System.out.print("Please input another integer, if you would like to end, enter \"-999\": ");

                value = read.nextInt();
        }
    }
}
