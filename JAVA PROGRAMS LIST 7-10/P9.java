// Write a simple class representing a Rectangle with attributes for width and height,
//  add methods to calculate the area, and perimeter, and check if it's a square.

import java.util.*;
class Rectangle{
     int width;
     int height;
     public double CalculateArea(int w , int h){
        this.width = w;
        this.height = h;

        return w*h;
     }
     public double CalculatePerimeter(int w , int h){
        this.width = w;
        this.height = h;

        return (2*(w+h));
     }
     public void checkingSquare(int w ,int h){
        this.width = w;
        this.height = h;
        if((2*(w+h)) == (4*w) || (2*(w+h)) == (4*h)){
            System.out.println("Rectangle is Square");
        }else{
            System.out.println("Rectangle is not a Square");
        }
     }
}
public class P9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of rectangle : ");
        int width = sc.nextInt();
        System.out.print("Enter height of rectangle : ");
        int height = sc.nextInt();
        Rectangle R1 = new Rectangle();
        R1.width = width;
        R1.height = height;
        System.out.println("Area of Rectangle : "+R1.CalculateArea(R1.width,R1.height));
        System.out.println("Perimeter of Rectangle : "+R1.CalculatePerimeter(R1.width,R1.height));
        R1.checkingSquare(R1.width,R1.height);

        sc.close();
    }
}
