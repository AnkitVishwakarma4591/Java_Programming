import java.util.*;
public class parameterized_Constructor {
    String name;
    int roll;
    float cgpa;

    parameterized_Constructor(String n,int r,float c){
        name = n;
        roll = r;
        cgpa = c;
    }
    void getInfo(){
        System.out.println("Name :"+ name);
        System.out.println("Roll_no : "+ roll);
        System.out.println("Cgpa : "+ cgpa);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        String name = sc.nextLine();
        System.out.print("Enter roll_no :");
        int roll = sc.nextInt();
        System.out.print("Enter Cgpa :");
        float cgpa = sc.nextFloat();

        parameterized_Constructor p1 = new parameterized_Constructor(name, roll, cgpa);
        p1.getInfo();
        sc.close();
    }

}
