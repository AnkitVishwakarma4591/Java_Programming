// Write a program that uses a while loop to calculate the sum of all even numbers between 1 and 100.

import java.util.*;

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int sum = 0;
        int i=1;
        System.out.println();
        while(i<=n){
            if(i%2 == 0){
                sum+=i;
            }
            i+=1;
        }
        System.out.println("The sum of all even numbers between 1 and "+n+" is: "+sum);
        
        sc.close();
        
    }    
}