package lab_3;

import java.util.*;

public class Rectangle_Const {
    double length;
    double breadth;

    // Default constructor
    public Rectangle_Const() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    public Rectangle_Const(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        // Using default constructor
        Rectangle_Const rectangle1 = new Rectangle_Const();
        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double l1=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double b1=sc.nextDouble();

        // Using parameterized constructor
        Rectangle_Const rectangle2 = new Rectangle_Const(l1, b1);
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());
    }
}