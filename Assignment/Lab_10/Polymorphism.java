/*
Write a program that uses virtual functions to achieve polymorphism. 
Create a base class Animal with a virtual method speaks and derived classes Dog and Cat.
 */

import java.util.*;
abstract class Animal{
    public abstract void speaks();
}
class Dog extends Animal{
    public void speaks(){
        System.out.println("The dog barks: Woof Woof! ");
    }
}
class Cat extends Animal{
    public void speaks(){
        System.out.println("The cat meows: Meow Meow! ");
    }
}
public class Polymorphism{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dog D1 = new Dog();
        Cat C1 = new Cat();
        System.out.println("Enter the type of animal (dog/cat): ");
        String name = sc.next();
        if(name.equals("dog")){
            D1.speaks();
        }else if(name.equals("cat")){
            C1.speaks();
        }else{
            System.out.println("Invalid input. Defaulting to a generic animal. ");
            System.out.println("This animal makes a sound. ");
        }
        
        
        sc.close();
    }
}

