// Write a do-while loop to find the factorial of a given number N

import java.util.*;
public class P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find Factorial :");
        int n = sc.nextInt();
        int fact = 1;
        int i=1;
        do{
            fact *=i;
            i++;
        }while(i<=n);
        System.out.println("Fact is : "+fact);
        sc.close();
    }
}
