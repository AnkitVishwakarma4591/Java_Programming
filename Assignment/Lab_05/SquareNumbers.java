
// Write a for loop to print the squares of numbers from 1 to 10.

import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the maximum number to square: ");
        for(int i=1;i<=n;i++){
            System.out.println("The square of "+i+" is: "+i*i);
        }
        
        sc.close();
    }
}