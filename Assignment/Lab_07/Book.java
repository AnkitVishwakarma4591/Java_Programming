/*Implement constructor overloading in a class Book to initialize book details in different ways 
(e.g., with title only, with title and author, with title, author, and price).

Example:

Details of book1:
Title: Java Programming
Author: Unknown
Price: ₹0.0

Details of book2:
Title: Python Programming
Author: Alice
Price: ₹0.0

Details of book3:
Title: C++ Programming
Author: Bob
Price: ₹29.99*/

import java.util.*;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor 1: Initialize with title only
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";  // Default value
        this.price = 0.0;         // Default value
        
        System.out.println("\nBook 1 details: ");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: ₹"+price);
    }

    // Constructor 2: Initialize with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;         // Default value
        
        System.out.println("\nBook 2 details: ");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: ₹"+price);
        
    }

    // Constructor 3: Initialize with title, author, and price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        
        System.out.println("\nBook 3 details: ");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: ₹"+price);
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the title of the first book: ");
        String title1 = sc.nextLine();
        
        
        System.out.println("Enter the title of the second book: ");
        String title2 = sc.nextLine();
        System.out.println("Enter the author of the second book: ");
        String author2 = sc.nextLine();
        
        
        System.out.println("Enter the title of the third book: ");
        String title3 = sc.nextLine();
        System.out.println("Enter the author of the third book: ");
        String author3 = sc.nextLine();
        System.out.println("Enter the price of the third book: ");
        double price3 = sc.nextDouble();
        
        
        Book B1 = new Book(title1);
        Book B2 = new Book(title2,author2);
        Book B3 = new Book(title3,author3,price3);
        
        sc.close();
    }
}