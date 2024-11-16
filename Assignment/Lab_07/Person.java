/*Write a Java program to create a class Person with default and parameterized constructors. 
Create objects using both constructors and print the details.

Example:

Details of person1 (using default constructor):
Name: Unknown
Age: 0
Address: Not Provided

Enter details for person2:
Enter name: Alice
Enter age: 30
Enter address: 123 Main St

Details of person2 (using parameterized constructor):
Name: Alice
Age: 30
Address: 123 Main St*/

import java.util.*;

// Person class definition
public class Person {

    public Person() {
        String name = "Unknown";
        int age = 0;
        String address = "Not Provided";
        
        System.out.println("Details of person1 (using default constructor): ");
        
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
    public Person(String name, int age,String address){
        System.out.println("\nDetails of person2 (using parameterized constructor): ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        
        System.out.println("\nEnter details for person2: ");
        
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline
        System.out.println("Enter address: ");
        String add = sc.nextLine();
        
        Person p1 = new Person(name,age,add);
        
        sc.close();
        
    }
}
