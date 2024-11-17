// Write a simple class representing a Rectangle with attributes for width and height,
//  add methods to calculate the area, and perimeter, and check if it's a square.

import java.util.*;

public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public double Area(double width, double height) {
        this.width = width;
        this.height = height;
        
        return (width*height);
        
    }
    public double perimeter(double width, double height) {
        this.width = width;
        this.height = height;
        
        return 2*(width+height);
        
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the width of the rectangle: ");
        int w = sc.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int h = sc.nextInt();
        
        Rectangle R = new Rectangle();
        System.out.println("Area of the rectangle: "+R.Area(w,h));
        System.out.println("Perimeter of the rectangle: "+R.perimeter(w,h));
        
        if(R.Area(w,h) == (w*w)){
            System.out.println("This rectangle is a square. ");
        }else{
            System.out.println("This rectangle is not a square. ");
        }
        
        sc.close();
        
        

    }
}