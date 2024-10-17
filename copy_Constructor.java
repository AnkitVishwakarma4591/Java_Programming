import java.util.Scanner;
public class copy_Constructor {
    String name;
    int roll;
    float cgpa;

    copy_Constructor(String n,int r,float c){
        name = n;
        roll = r;
        cgpa = c;
    }
    // creating copy constructor
    copy_Constructor(copy_Constructor obj){
        this.name = obj.name;
        this.roll = obj.roll;
        this.cgpa = obj.cgpa;
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

        copy_Constructor p1 = new copy_Constructor(name, roll, cgpa);
        // Creating copy consturctor
        copy_Constructor p2 =  new copy_Constructor(p1); // for this need to create copy Constructor in class
        
        // copy_Constructor p2 = p1; //for this no need to create copyConstructor in class

        p2.getInfo();
        sc.close();
    }
}
