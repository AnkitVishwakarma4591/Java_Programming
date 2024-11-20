/*
Create a simple interface and implement it in a class.
*/
import java.util.*;

interface input{
    public void print();
    public void takeInput();
}
class userInput implements input{
    String st ;
    public void print(){
    //   System.out.println(st); 
    }
    public void takeInput(){
       System.out.println("Printing user input: Hello, World! ");  
    }
    
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        String st = sc.nextLine();
        
        userInput s1 = new userInput();
        s1.st = st;
        s1.print();
        s1.takeInput();
        
        sc.close();
    }
}