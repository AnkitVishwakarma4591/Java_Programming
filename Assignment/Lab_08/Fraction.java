/*
Create a Fraction class that represents a fraction with numerator and denominator. 
Implement methods to perform addition and subtraction between two Fraction objects. 
Additionally, implement a method to simplify the fraction to its lowest terms. 
Write a main method to demonstrate these operations.
*/

import java.util.*;

class Fraction1 {
    int a, b; // Numerators
    int x, y; // Denominators

    // Helper method to find the GCD of two numbers
    private int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Simplify a fraction
    private String simplifyFraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return numerator + "/" + denominator;
    }

    public String getSimplifiedFraction(int numerator, int denominator) {
        return simplifyFraction(numerator, denominator);
    }

    public void AddFraction() {
        if (x == y) {
            int numerator = a + b;
            System.out.println("Sum: " + simplifyFraction(numerator, x));
        } else if (x == 0 || y == 0) {
            System.out.println("Denominator can't be Zero!");
        } else {
            int numerator = (a * y) + (b * x);
            int denominator = x * y;
            System.out.println("Sum: " + simplifyFraction(numerator, denominator));
        }
    }

    public void subtractFraction() {
        if (x == y) {
            int numerator = a - b;
            System.out.println("Difference: " + simplifyFraction(numerator, x));
        } else if (x == 0 || y == 0) {
            System.out.println("Denominator can't be Zero!");
        } else {
            int numerator = (a * y) - (b * x);
            int denominator = x * y;
            System.out.println("Difference: " + simplifyFraction(numerator, denominator));
        }
    }
}

public class Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator for the first fraction: ");
        int a = sc.nextInt();
        System.out.println("Enter denominator for the first fraction:");
        int x = sc.nextInt();

        System.out.println("Enter numerator for the second fraction: ");
        int b = sc.nextInt();
        System.out.println("Enter denominator for the second fraction:");
        int y = sc.nextInt();

        Fraction1 f1 = new Fraction1();
        f1.a = a;
        f1.x = x;
        f1.b = b;
        f1.y = y;

        System.out.println("First Fraction: " + f1.getSimplifiedFraction(a, x));
        System.out.println("Second Fraction: " + f1.getSimplifiedFraction(b, y));

        f1.AddFraction();
        f1.subtractFraction();
        sc.close();
    }
}
