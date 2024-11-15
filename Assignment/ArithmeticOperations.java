import java.util.*;

class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean s = sc.nextBoolean();

    }
}
import java.util.*;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        System.out.println("Enter the first number: ");
        int b = sc.nextInt();
        System.out.println("Enter the second number: ");
        
        System.out.println("Addition: "+a+" + "+b+" = "+(a+b));
        System.out.println("Subtraction: "+a+" - "+b+" = "+(a-b));
        System.out.println("Multiplication: "+a+" * "+b+" = "+(a*b));
        System.out.println("Division: "+a+" / "+b+" = "+(a/b));
        
        // if(b==0){
        //     System.out.println("Division not possible");
        // }else{
            
        // }
        

        sc.close();
    }
}