// Write a Java program that includes overloaded methods for 
// calculating the area of different shapes (circle, rectangle, triangle).
// Instructions:

import java.util.Scanner;

public class AreaCalculator {

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("Enter the number corresponding to the shape: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Circle
                System.out.println("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                if (radius > 0) {
                    double circleArea = calculateArea(radius);
                    System.out.println("Area of the circle: " + circleArea);
                } else {
                    System.out.println("Invalid radius. Please enter a positive number.");
                }
                break;

            case 2: // Rectangle
                System.out.println("Enter the width of the rectangle: ");
                double length = sc.nextDouble();
                System.out.println("Enter the height of the rectangle: ");
                double width = sc.nextDouble();
                if (length > 0 && width > 0) {
                    double rectangleArea = calculateArea(length, width);
                    System.out.println("Area of the rectangle: " + rectangleArea);
                } else {
                    System.out.println("Invalid dimensions. Please enter positive numbers.");
                }
                break;

            case 3: // Triangle
                System.out.println("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                if (base > 0 && height > 0) {
                    double triangleArea = calculateArea(base, height, true);
                    System.out.println("Area of the triangle: " + triangleArea);
                } else {
                    System.out.println("Invalid dimensions. Please enter positive numbers.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        sc.close();
    }
}
