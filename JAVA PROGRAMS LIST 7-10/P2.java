// Write a program using nested for loops to print the multiplication table from 1 to 5.

public class P2 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" * "+i+" = "+j*i+"\t");
            }
            System.out.println();
        }
    }
}
