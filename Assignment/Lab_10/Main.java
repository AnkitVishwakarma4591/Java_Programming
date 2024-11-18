
/*
Write a program demonstrating basic inheritance by creating a base 
class Shape and a derived class Circle extending Shape.


Enter the radius of the circle: 
This is a shape.
Circle with radius 2.40:
Area: 18.10
Circumference: 15.08
*/
import java.util.Scanner;


abstract class Shape {
    
    public abstract double getArea();

    
    public void display() {
        System.out.println("This is a shape.");
    }
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    
    @Override
    public void display() {
        
        

        
        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative.");
        } else {
            super.display();
            System.out.printf("Circle with radius %.2f:%n", radius);
            System.out.printf("Area: %.2f%n", getArea());
            System.out.printf("Circumference: %.2f%n", getCircumference());
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble(); 

        
        Circle circle = new Circle(r);

        
        circle.display();

        sc.close(); 
    }
}
