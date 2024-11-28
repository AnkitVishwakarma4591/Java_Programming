import java.io.*;

public class Throws {
    
    public static void readFile(String fileName) throws IOException {
        // FileReader file = new FileReader(fileName); 
        // BufferedReader reader = new BufferedReader(file);   
        
        BufferedReader reader = new BufferedReader( new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) {
        try {
            
            readFile("nonexistent_file.txt");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues execution after handling exception.");
    }
}
