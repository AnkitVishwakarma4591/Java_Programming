import java.util.Scanner;

public class Checking_Num {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive :"+a);
        }else if(a<0){
            System.out.println("Negative :"+a);
        }
        else{
            System.out.println("Zero :"+a);
        }
        sc.close();
    }
}