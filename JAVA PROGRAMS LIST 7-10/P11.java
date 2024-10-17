// Create a Fraction class that represents a fraction with numerator and denominator. 
// Implement methods to perform addition and subtraction between two Fraction objects. 
// Additionally, implement a method to simplify the fraction to its lowest terms. 
//  Write a main method to demonstrate these operations.

import java.util.*;
class Fraction{
    int a,b;
    int x,y;
    public void AddFraction(){
        if(x == y){
            int numerator = a+b;
            System.out.println(a+"/"+x+" + "+b+"/"+y+" = "+numerator+"/"+x);
        }
        else if( x == 0 || y==0){
            System.out.println("Denominator can't be Zero !");
        }
        else{
            int numerator = (a*y) + (b*x);
            int denominator = x*y;
            System.out.println(a+"/"+x+" + "+b+"/"+y+" = "+numerator+"/"+denominator);
        }
    }
    public void subtractFraction(){
        if(x == y){
            int numerator = a-b;
            System.out.println(a+"/"+x+" - "+b+"/"+y+" = "+numerator+"/"+x);
        }
        else if( x == 0 || y==0){
            System.out.println("Denominator can't be Zero !");
        }
        else{
            int numerator = (a*y) - (b*x);
            int denominator = x*y;
            System.out.println(a+"/"+x+" - "+b+"/"+y+" = "+numerator+"/"+denominator);
        }
    }
}
public class P11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fraction 1");
        System.out.print("Enter numerator : ");
        int a = sc.nextInt();
        System.out.print("Enter denominator : ");
        int x = sc.nextInt();
        System.out.println("Fraction 2");
        System.out.print("Enter numerator : ");
        int b = sc.nextInt();
        System.out.print("Enter denominator : ");
        int y = sc.nextInt();

        Fraction f1 = new Fraction();
        f1.a = a ;
        f1.x = x ;
        f1.b = b ;
        f1.y = y ; 
        f1.AddFraction();
        f1.subtractFraction();
        sc.close();
    }
}
