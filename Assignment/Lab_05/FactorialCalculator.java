// Write a do-while loop to find the factorial of a given number N

import java.util.*;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter a number: ");
        int fact=1;
        int i=1;
        do{
            if(n == 0){
                System.out.println("The factorial of 0 is: "+1);
                return;
            }
            fact*=i;
            i+=1;
            
        }while(i<=n);
        System.out.println("The factorial of "+n+" is: "+fact);
        sc.close();
    }
}