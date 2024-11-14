// Develop a Java program that generates Fibonacci numbers using a do-while loop and stores them in an array. 
// Implement a search function to find the index of a given Fibonacci number within the array.
import java.util.*;
public class P4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Taking input  number from user
        System.out.print("Enter number to find Fibonacci Series : ");
        int n = sc.nextInt();
        
        // generates Fibonacci numbers
        // Initializing the number
        int first = 0;
        int second = 1;
        // creating the array
        int array[] = new int[n];
        int i=1;
        do{
            System.out.print(first + " ");
            array[i-1] = first;
            int next = first + second ;
            first = second;
            second = next;
            i++;

        }while(i<=n);
        System.out.println();
        System.out.println("Fibonacci Series : " + Arrays.toString(array));
        
        
        String option;
        do{
            // Finding Fibonacci number in array:
            System.out.print("Enter number to search : ");
            int num = sc.nextInt();
            for(int j=0;j<array.length;j++){
                if(array[j] == num ){
                    System.out.println("Found at index : "+j);
                }
            }
            System.out.print("Do you want to Continue type(yes/no) :");
            option = sc.next();
        }while(option != "no");

        sc.close();

    }
}
