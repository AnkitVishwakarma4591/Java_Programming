
import java.util.*;
public class Non_parameterized_Constructor {
    Non_parameterized_Constructor(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Non_parameterized_Constructor c1 = new Non_parameterized_Constructor();
        sc.close();
    }
}
