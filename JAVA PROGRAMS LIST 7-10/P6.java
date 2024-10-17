// Write a Java program that includes overloaded methods 
// for calculating the area of different shapes (circle, rectangle, triangle).

import java.util.*;

public class P6 {

    public static double Area(int r) {
        return (3.12 * r * r);
    }

    public static double Area(int l, int b) {
        return (l * b);
    }

    public static double Area(float b, float h) {
        return (1 / 2 * b * h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option;
        do {
            System.out.println("1. Area of Circle.");
            System.out.println("2. Area of Rectangle.");
            System.out.println("3. Area of Triangle.");
            System.out.println("4. Exit.");
            System.out.print("Choose your Option : ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter radius of Circle :");
                    int r = sc.nextInt();
                    System.out.println("Area of Circle is : " + Area(r));
                    break;

                case 2:
                    System.out.print("Enter length of Rectangle :");
                    int l = sc.nextInt();
                    System.out.print("Enter breadth of Rectangle  :");
                    int b = sc.nextInt();
                    System.out.println("Area of Rectangle is : " + Area(l, b));
                    break;

                case 3:
                    System.out.print("Enter base of Triangle : ");
                    float c = sc.nextInt();
                    System.out.print("Enter base of Triangle : ");
                    float h = sc.nextInt();
                    System.out.println("Area of Triangle is : " + Area(c, h));
                    break;
                case 4:
                    System.out.println("Exit program...");
                    break;
                default:
                    System.out.println("Invalid input...");
            }
            System.out.print("Do want to try again type(yes/no) : ");
            option = sc.next();
        } while (option != "no");
        sc.close();
    }
}