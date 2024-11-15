// Write a while loop to print the first 10 even numbers.

import java.util.*;

public class FirstTenEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter an even starting number: ");
        if(n%2 != 0){
            System.out.println("Error: Please enter an even number.");
            return;
        }
        int i=1;
        while(i<=10){
            System.out.println(n);
            n+=2;
            i+=1;
            
        }
        sc.close();
    }
}