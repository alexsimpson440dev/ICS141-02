package com.labs.lab6;

public class Lab6 {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Windows", "Aluminum", 499.99);
        Brand brand1 = new Brand("Lenovo", "ThinkPad");
        // Hardware does not have a toString method to plymorphism and dynamic binding take place to decide which toString method to use.
        Hardware hardware1 = new Hardware("Intel", "Intel Integrated", 8, "Lenovo", "Thinkpad");

        System.out.println(computer1.toString());
        System.out.println(brand1.toString());
        System.out.println(hardware1.toString());
    }
}
