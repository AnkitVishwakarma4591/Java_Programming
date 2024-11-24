
/*
Create a Student class with attributes name, studentID, and an ArrayList of grades. 
Implement methods to add a grade, calculate the average grade, and display the student's 
information along with their average grade. Write a main method to create a Student object, 
add several grades, and display the student's information and average grade.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String studentID;
    private ArrayList<Double> grades;

    
    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter student name: \n");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: \n");
        String studentID = scanner.nextLine();

        
        Student student = new Student(name, studentID);

        System.out.println("Enter grades for the student (type 'done' to finish):");
        while (true) {
            System.out.print("Enter grade: \n");
            if (!scanner.hasNextLine()) {
                break;
            }
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double grade = Double.parseDouble(input);
                student.addGrade(grade);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid grade or type 'done' to finish.");
            }
        }

        
        student.displayStudentInfo();

        // Close the scanner
        scanner.close();
    }
}