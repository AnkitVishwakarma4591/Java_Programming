// Create a file which contain student details:

import java.io.*;
public class StudentFile {
    public static void main(String[] args){
        String Student = "student.txt";

        try{
            File file  = new File(Student);
            if(file.createNewFile()){
                System.out.println("File created Sucessfully :"+file.getName());
            }else{
                System.out.println("already exists");
            }

            FileWriter w = new FileWriter(Student);
            w.write("Name : Ankit Vishwakarma");
            w.write("Branch : C.S.E");
            w.write("CGPA : 9.3");

            w.close();

            BufferedReader read = new BufferedReader(new FileReader(Student));
            System.out.println("Reading from the file");

            String line;

            while((line = read.readLine()) != null){
                System.out.println(line);
            }
            read.close();

            if(file.exists()){
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.length());
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
