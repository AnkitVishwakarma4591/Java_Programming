// // Write a Java program that performs basic arithmetic operations 
// (addition, subtraction, multiplication, division)
//  on two user-provided numbers.

import java.util.*;

public class ArithmeticOperations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();
        
        System.out.println("Addition: "+a+" + "+b+" = "+(a+b));
        System.out.println("Subtraction: "+a+" - "+b+" = "+(a-b));
        System.out.println("Multiplication: "+a+" * "+b+" = "+(a*b));
        System.out.println("Division: "+a+" / "+b+" = "+(a/b));
        
        sc.close();
    }
}
    