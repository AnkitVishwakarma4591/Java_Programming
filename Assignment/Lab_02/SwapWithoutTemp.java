// Write a Java program that swaps the 
// values of two variables without using a third variable. 

import java.util.Scanner;

public class SwapWithoutTemp {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for variable a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value for variable b: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("After swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        sc.close();
    }
}