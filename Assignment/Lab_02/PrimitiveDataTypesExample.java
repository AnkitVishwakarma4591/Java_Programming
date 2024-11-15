// '''Write a Java program to declare and initialize 
// variables of different primitive data types (int, float, char, boolean) 
// and print their values.'''

import java.util.*;

public class PrimitiveDataTypesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int a = sc.nextInt();
        System.out.println("Enter a float value: ");
        float b = sc.nextFloat();
        System.out.println("Enter a character value: ");
        String c = sc.next();
        System.out.println("Enter a boolean value (true/false): ");
        boolean s = sc.nextBoolean();
        
        System.out.println("Integer value: "+a);
        System.out.println("Float value: "+b);
        System.out.println("Character value: "+c);
        System.out.println("Boolean value: "+s);
    }
}