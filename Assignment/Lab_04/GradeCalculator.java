// Create a program that calculates the grade based on the percentage of 
// marks the user enters using a switch statement.

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the percentage of marks: ");
        double avg = sc.nextDouble(); 
        
        String grade;
        
        
        if(avg>0 && avg<=60){
            grade = "F";
        }else if(avg>60 && avg<=75){
            grade = "D";
        }
        else if(avg>75 && avg<=80){
            grade = "C";
        }else if(avg>80 && avg<=85){
            grade = "B";
        }else{
            grade = "A";
        }
        System.out.println("The grade is: "+grade);
        
        sc.close();
    }
    
}