
import java.util.*;
public class Fahrenheit_Celsius {

    public static void calculateCelsius(int f){
        double c = (f-32)*5/9;
        System.out.println("After Converting Fahrenheit, Celsius is : "+ c);
    }

    public static void calculateFahrenheit(int c){
        double f = (c*9/5)+32;
        System.out.println("After Converting Celsius, Fahrenheit is : "+ f);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Menu");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice :");
            choice = sc.nextInt();

            switch(choice){
                case 1 : System.out.print("Enter Fahrenheit Value : ");
                         int f = sc.nextInt();
                         calculateCelsius(f);
                         break;
                case 2 : System.out.print("Enter Celsius Value : ");
                         int c = sc.nextInt();
                         calculateFahrenheit(c);
                         break;
                case 3 : System.out.println("Exit");
                            break;
                default : System.out.println("Tyr again !");
            }
        }while(choice != 3);

        sc.close();
    }
}
