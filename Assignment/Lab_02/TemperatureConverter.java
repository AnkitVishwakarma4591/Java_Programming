// Create a program that converts temperature from Celsius to Fahrenheit and vice versa, 
// demonstrating type casting and using primitive and reference data types.

import java.util.*;

public class TemperatureConverter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose the conversion type: ");
        System.out.println("1. Celsius to Fahrenheit ");
        System.out.println("2. Fahrenheit to Celsius ");
        int choice = sc.nextInt();

        
        switch (choice) {
            case 1:  System.out.println("Enter temperature in Celsius: ");
                        float celsius = sc.nextFloat();
                        System.out.println(" Temperature in Fahrenheit: "+((celsius * 9 / 5) + 32));
                        
                        break;
            case 2:  System.out.println("Enter temperature in Fahrenheit: ");
                        float fahrenheit = sc.nextFloat();
                        System.out.println(" Temperature in Celsius: "+((fahrenheit - 32) * 5 / 9));
                        
                        break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        
        System.out.println("\nDemonstrating Type Casting:");
        System.out.print("Enter a double value for type casting: ");
        double num = sc.nextDouble();
        int num2 = (int) num;
        System.out.println("Double value: "+num);
        System.out.println("Converted to int: "+num2);
        
        System.out.println("Wrapper class Double value: " + num);
     
        System.out.println("Wrapper class Integer value: " + num2);
        
        sc.close();
    }
}   