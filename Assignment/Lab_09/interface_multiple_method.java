/*
Create an interface with multiple methods and implement it in a class
 */

import java.util.*;

interface MathOperations{
    public void add();
    public void subtract();
    public void multiply();
    public void divide();
}
class Calculator implements MathOperations{
    float a;
    float b;
    public Calculator(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void add(){
        double sum = a+b;
        System.out.println("Addition: "+sum);
    }
    public void subtract(){
        double sub = a-b;
        System.out.println("Subtraction: "+sub);
    }
    public void multiply(){
        double pro = a*b;
        System.out.println("Multiplication: "+pro);
    }
    public void divide(){
        double div;
        if(b == 0){
            System.out.println("Error: Division by zero is not allowed. Please provide a non-zero divisor. ");
        }else{
            div = (a/b);
            System.out.println("Division: "+div);
        }
        
    }
}
public class interface_multiple_method{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number: ");
       int a = sc.nextInt();
       System.out.println("Enter second number: ");
       int b = sc.nextInt();
       
       Calculator C1 = new Calculator(a,b);
       C1.add();
       C1.subtract();
       C1.multiply();
       C1.divide();
       sc.close();
    }
}
