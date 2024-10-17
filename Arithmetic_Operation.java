// Write a Java program that performs basic arithmetic operations (addition,
// subtraction, multiplication, division) on two user-provided numbers.

import java.util.Scanner;

public class Arithmetic_Operation {

    public static int Addition(int a,int b){
        return a+b;
    }

    public static int Subtraction(int a,int b){
        return a-b;
    }

    public static float Multiplication(int a,int b){
        return a*b;
    }

    public static double Division(int a,int b){
        if(b ==0){
            System.out.println("Division not Possible");
        }
        return a%b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num2 : ");
        int b = sc.nextInt();

        System.out.println("Sum of two number is : "+Addition(a, b));
        System.out.println("Subtraction of two number is : "+Subtraction(a, b));
        System.out.println("Multiplication of two number is : "+Multiplication(a, b));
        System.out.println("Division of two number is : "+Division(a, b));

        sc.close();
    }    
}