package com.assignments.assignment6;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        super.setPerimeter(perimeter);

        return perimeter;
    }

    public double calculateArea() {
        double p;
        double area;
        double perimeter = super.getPerimeter();

        // verify the perimeter has a value, because if it does not, then area will be nothing
        if(perimeter == 0) {
            perimeter = calculatePerimeter();
        }
        p = perimeter/2;
        area = Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
        super.setArea(area);

        return area;
    }
}
