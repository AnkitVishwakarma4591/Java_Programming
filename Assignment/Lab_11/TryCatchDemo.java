// Write a program that demonstrates the use of try-catch blocks.
import java.util.*;
// import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            System.out.println("You entered: "+a);
            System.out.println("Scanner closed. ");
            
        }
        
        catch(Exception e){
            System.out.println("Error: Please enter a valid integer. ");
            System.out.println("Scanner closed. ");
        }
        
        sc.close();
    }
}