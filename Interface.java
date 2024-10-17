import java.util.*;
interface User_input{
    public void input();
    
}
interface display{
    public void output();
}
class Interface implements User_input,display{
    String name ;
    int roll ;
    float cgpa;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter roll number : ");
        roll = sc.nextInt();
        System.out.print("Enter your Cgpa : ");
        cgpa = sc.nextFloat();

        sc.close();
    }
    public void output(){
        System.out.println("Your Name : "+name);
        System.out.println("Your Roll_no. : "+roll);
        System.out.println("Your Cgpa : "+cgpa);
    }
    public static void main(String[] args){
        Interface s = new Interface();
        s.input();
        s.output();
    }
}