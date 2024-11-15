// Write a do-while loop to print numbers from 10 to 1.

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=n;
        System.out.println("Enter the starting number:");
        do{
            if(n==0){
                System.out.println("Error: Please enter a number greater than 0.");
                return;
            }
            System.out.println(i);
            i-=1;
        }while(i>=1);
        // for(int i=n;i>=1;i--){
        //     System.out.println(i);
        // }
        sc.close();
    }
}