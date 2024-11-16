// Write a Java program to check if a number is positive, negative, or zero using an if-else statement.

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter a number: ");
        float n = sc.nextFloat();
        
        if(n<0){
            System.out.println(n+" is negative.");
        }else if(n>0){
            System.out.println(n+" is positive.");
        }else{
            System.out.println("The number is zero. ");
        }
        
        sc.close();
        
    }
}
        