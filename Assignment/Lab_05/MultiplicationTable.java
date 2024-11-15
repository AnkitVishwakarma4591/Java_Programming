// Write a program using nested for loops to print the multiplication table from 1 to 5.

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Enter the maximum value for the multiplication table:");
        if(n<=0){
            System.out.println("Error: Please enter a positive number greater than zero. ");
            return;
        }
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                System.out.print(j*i+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}    