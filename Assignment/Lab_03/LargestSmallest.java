// Write a Java program to find the largest and smallest of three numbers using conditional operators.

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.println("The largest number is: "+a);
        }else if(b>a && b>c){
            System.out.println("The largest number is: "+b);
        }
        else{
            System.out.println("The largest number is: "+c);
        }
        
        System.out.println();
        if(a<b && a<c){
            System.out.println("The smallest number is: "+a);
        }else if(b<a && b<c){
            System.out.println("The smallest number is: "+b);
        }
        else{
            System.out.println("The smallest number is: "+c);
        }
        
        
        sc.close();
    }
}