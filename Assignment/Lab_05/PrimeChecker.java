// Create a program to check if a given number is prime or not using a for loop.

import java.util.*;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter a number: ");
        int count=0;
        if(n==1){
            System.out.println(n+" is not a prime number.");
        }else{
            for(int i=1;i<=n;i++){
                if(n%i == 0){
                    count+=1;
                }
            }
        }
        
        if(count == 2){
            System.out.println(n+" is a prime number.");
        }
        
        sc.close();
    }
}