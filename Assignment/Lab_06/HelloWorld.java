package Lab_06;
// Write a Java program that defines a simple method to print "Hello, World!" 
// and call this method from the main method.    


import java.util.Scanner;

public class HelloWorld {
    public static void printHelloWorld(){
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        String name = "Moodle";
        System.out.println("Enter the word: ");
        
        String word = sc.next();
        if(name.equals(word)){
            printHelloWorld();
        }else{
            System.out.println("Incorrect input. Please enter 'moodle'. ");
        }
        
        sc.close();
    }

}

    
