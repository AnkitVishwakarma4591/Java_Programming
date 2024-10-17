// Write a Java program to create a class Person with default and parameterized constructors. 
// Create objects using both constructors and print the details.

import java.util.*;
class Person{
    Person(){
        System.out.println("Hey, My self Ankit Vishwakarma!");
    }
    Person(String name){
        System.out.println("And you are "+name);
    }
}
public class P7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        Person p1 = new Person();
        Person p2 = new Person(name);

        sc.close();
    }
}
