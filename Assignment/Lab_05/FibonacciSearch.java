import java.util.Scanner;

public class FibonacciSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input  number from user
        int n = sc.nextInt();
        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        System.out.println("Generated Fibonacci numbers: ");
        int first = 0;
        int second = 1;
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
        System.out.println("");
        int num = sc.nextInt();
        System.out.println("Enter a Fibonacci number to search for: ");
        
        boolean found = false;
        for(int j=0;j<=array.length-1;j++){
            if(num == array[j]){
                System.out.println("The number "+num+" is found at index "+j+". ");
                found = true;     
                break; 
            }
            
        }
        if(!found){
            System.out.println("The number "+num+" is not found in the array. ");
        }
            

        sc.close();

    }
}
