// Implement constructor overloading in a class Book to initialize book details in different ways 
// (e.g., with title only, with title and author, with title, author, and price).

import java.util.*;
class Book{
    Book(String title, String publication){
        System.out.println("Book Title is : "+title);
        System.out.println("Book Publication is : "+publication);
    }
    Book(String author , int price){
        System.out.println("Book Author name is : "+author);
        System.out.println("Book Price is : "+price);
    }
}
public class P8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write Book title : ");
        String title = sc.nextLine();
        System.out.print("Write Publication Name : ");
        String publication = sc.nextLine();
        System.out.print("Write Book Author Name : ");
        String author = sc.nextLine();
        System.out.print("Enter Book price : ");
        int price = sc.nextInt();

        // Calling of Constructor
        Book B1 = new Book(title, publication);
        Book B2 = new Book(author, price);
        sc.close();
    }
}
