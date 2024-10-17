

import java.util.*;

public class largest_smallest {

    public static void largest(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("Largest is : "+ a);
        }else if(b>a && b>c){
            System.out.println("Largest is : "+ b);
        }else{
            System.out.println("Largest is : "+ c);
        }
    }

    public static void Smallest(int a , int b, int c){
        if(a<b && a<c ){
            System.out.println("Smallest is : "+a);
        }else if(b<a && b<c){
            System.out.println("Smallest is : "+b);
        }else{
            System.out.println("Smallest is : "+c);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        do{
            System.out.print("Enter 1st Value : ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Value : ");
            int b = sc.nextInt();
            System.out.print("Enter 3rd Value : ");
            int c = sc.nextInt();

            largest(a,b,c);
            Smallest(a,b,c);

            System.out.print("Do you want to Continue type(yes/no) : ");
            str = sc.next();
        }while(!str.equalsIgnoreCase("no"));
        sc.close();
    }
}
