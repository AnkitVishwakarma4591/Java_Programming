// Create a class MathUtils with static methods for common 
// mathematical operations (add, subtract, multiply, divide). 
// Call these methods from the main method.

import java.util.*;

class MathUtils{
    
    public static int  Add(int a ,int b){
        return a+b;
    }
    public static int Subtract(int a, int b){
        return a-b;
    }
    public static double Multiply(int a , int b){
        return a*b;
    }
    public static double Divide(int a, int b){
        if(b == 0){
            System.out.println("Division not Possible!");
        }
        return a/b;
    }

}
public class P5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Mathematical operations
        System.out.println("Mathematical operations!");
        System.out.print("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int b = sc.nextInt();
        // creating onject
        // MathUtils m1 = new MathUtils();
        
        // calling of method:
        System.out.println("\nMathematical operations (add, subtract, multiply, divide)");
        System.out.println("Sum of Number : "+MathUtils.Add(a, b));
        System.out.println("Difference of Number : "+MathUtils.Subtract(a, b));
        System.out.println("Multiplication of Number : "+MathUtils.Multiply(a, b));
        System.out.println("Division of Number : "+MathUtils.Divide(a, b));
        sc.close();
    }
}
