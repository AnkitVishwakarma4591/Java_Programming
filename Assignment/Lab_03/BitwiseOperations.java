// Create a program that uses bitwise operators to perform bitwise operations (AND, OR, XOR) 
// on two integers and prints the results. 

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int a = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int b = sc.nextInt();
        
        
        System.out.println("Bitwise AND: "+a+" & "+b+" = "+(a&b));
        System.out.println("Bitwise OR: "+a+" | "+b+" = "+(a|b));
        System.out.println("Bitwise XOR: "+a+" ^ "+b+" = "+(a^b));
        
        
        sc.close();
    }
}