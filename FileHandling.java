import java.io.*;
// import java.util.*;

public class FileHandling {

    public static void main(String[] args){
        String name = "context.txt";
        try{
            File file = new File(name);
            if(file.createNewFile()){
                System.out.println("File Created :"+file.getName());

            }else{
                System.out.println("File already exists:");
            }

            FileWriter w = new FileWriter(name);
            w.write("Hello, I am Ankit !");
            w.close();
            System.out.println("Sucessfully wrote to the file");

            BufferedReader read = new BufferedReader(new FileReader(name));

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