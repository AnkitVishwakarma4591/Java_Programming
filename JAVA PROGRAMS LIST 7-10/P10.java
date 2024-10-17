/*Create a Student class with attributes name, studentID, and an ArrayList of grades. 
Implement methods to add a grade, calculate the average grade, 
and display the student's information along with their average grade. 
Write a main method to create a Student object, add several grades, 
and display the student's information and average grade.*/


import java.util.*;
class Student{
    String name;
    int stu_id;
    int stu_sub_no ;
    int grade[] = new int[stu_sub_no];

    public void Grade(int arr[]){
        this.grade = arr;
        System.out.println("Student Grade : "+Arrays.toString(arr));
    }
    public void CalculateAvg(int arr[],int size){
        this.grade = arr;
        this.stu_sub_no = size;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        float avg = (sum/size);
        System.out.println("Student Average : "+avg);
    }
    public void Display(){
        System.out.println("Student Name : "+name);
        System.out.println("Student I'D : "+stu_id);
        Grade(grade);
        CalculateAvg(grade, stu_sub_no);
    }
}

public class P10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your I'D : ");
        int id = sc.nextInt();
        System.out.print("Enter number of Subjects : ");
        int num = sc.nextInt();
        int grade[] = new int[num];
        for(int i=0;i<grade.length;i++){
            System.out.print("Enter makrs of "+(i+1)+" subject : ");
            grade[i] = sc.nextInt();
        }
        Student S1 = new Student();
        S1.name = name;
        S1.stu_id = id;
        S1.stu_sub_no = num;
        S1.grade = grade;
        System.out.println("\nStudent Details ");
        S1.Display();
        sc.close();
    }
}
