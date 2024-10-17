// Write a Java program to declare and initialize variables of different primitive
//  data types (int, float, char, boolean) and print their values.

import java.util.Scanner;
public class Data_types {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer Value : ");
        int myInt = sc.nextInt();
        System.out.print("Enter Float Value : ");
        float myFloat = sc.nextFloat();
        System.out.print("Enter character Value : ");
        char myChar = sc.next().charAt(0);
        System.out.print("Enter Boolean Value(true/false) : ");
        boolean myBoolean = sc.nextBoolean();

        System.out.println("Interger Value :"+myInt);
        System.out.println("Float Value :"+myFloat);
        System.out.println("Character Value :"+myChar);
        System.out.println("Boolean Value :"+myBoolean);
        sc.close();
    }
}
