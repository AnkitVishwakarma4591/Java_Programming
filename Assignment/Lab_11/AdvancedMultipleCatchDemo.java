/*
Implement a program that includes multiple catch blocks and a finally block.
 */

import java.util.*;
import java.util.InputMismatchException;

public class AdvancedMultipleCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            
            
            System.out.println("Enter an integer: ");
            int number = scanner.nextInt();
            
            
            System.out.println("Enter a divisor: ");
            int divisor = scanner.nextInt();
            
            
            int result = number / divisor;
            System.out.println("Result of division: " + result);
            
        } catch (InputMismatchException e) {
            
            System.out.println("Error: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Cannot divide by zero. ");
        } finally {
            
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Scanner closed. Resources released. ");
        }
    }
}
