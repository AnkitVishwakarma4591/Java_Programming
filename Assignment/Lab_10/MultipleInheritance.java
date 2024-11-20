/*
Create a program that demonstrates multiple inheritance by creating a base class Person, 
a base class Employee, and a derived class Manager that inherits from both base classes. 
Implement and demonstrate methods from both base classes in the derived class.
 */

import java.util.*;
interface Person{
    public void Details();
}
interface Employee{
    public void companydetails();
}
class Manager implements Person,Employee{
    String name;
    int age;
    int emplyId;
    String dept;
    
    
    public void Details(){
        System.out.println("\nManager Details:");
        System.out.println("Manager's Name: "+name);
        System.out.println("Manager's Age: "+age);
    }
    public void companydetails(){
        System.out.println("Employee ID: "+emplyId);
        System.out.println("Department: "+dept);
    }
}
public class MultipleInheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Manager's Name: ");
        String name = sc.next();
        int age;
        while (true) {
            System.out.println("Enter Manager's Age: ");
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("Invalid input: Age cannot be negative. Please enter a valid age.");
            } else {
                break;
            }
        }
        System.out.println("Enter Employee ID: ");
        int emplyId = sc.nextInt();
        System.out.println("Enter Department: ");
        String dept = sc.next();
        
        Manager M1 = new Manager();
        M1.name = name;
        M1.age = age;
        M1.emplyId = emplyId;
        M1.dept = dept;
        
        M1.Details();
        M1.companydetails();
        
        sc.close();
    }
}