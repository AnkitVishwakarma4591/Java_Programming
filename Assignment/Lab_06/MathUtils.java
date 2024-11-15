package Lab_06;
import java.util.*;

public class MathUtils {
    public static void StaticMethods(float a, float b) {
        
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
        if (b == 0) {
            System.out.println("Division not possible");
        } else {
            System.out.printf("Division: %.1f / %.1f = %.2f%n", a, b, (a / b));
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();
        
        StaticMethods(a, b);
        
        sc.close();
    }
}
