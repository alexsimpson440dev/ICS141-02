package com.assignments.assignment6;

public class Assignment6 {
    public static void main(String[] args) {
        // three samples
        // 1 = create triangle with constructor for all sides, perimeter will be calculated manually
        // 2 = create triangle with constructor for all sides, perimeter will be calculated on the calculateArea() call
        // 3 = create triangle with no arg constructor, result is 0 as all sides are still set to 0
        Triangle sampleTriangle1 = new Triangle(24, 30, 18);
        Triangle sampleTriangle2 = new Triangle(24, 30, 18);
        Triangle sampleTriangle3 = new Triangle();

        System.out.println(sampleTriangle1.calculatePerimeter());
        System.out.println(sampleTriangle3.calculatePerimeter());

        System.out.println(sampleTriangle1.calculateArea());
        System.out.println(sampleTriangle2.calculateArea());
        System.out.println(sampleTriangle3.calculateArea());
    }
}
