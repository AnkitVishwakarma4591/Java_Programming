import java.util.*;

public class Throw {
    public static void checkAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be greater than 18 ");
        }
        System.out.println("Eligible for Vote!");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        try{
            checkAge(age);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        sc.close();

    }
}
