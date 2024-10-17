
// Implement a matrix multiplication operation using nested while loops.
import java.util.*;

public class P3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Order of Matri 1.
        System.out.println("Enter order for Matrix_1");
        System.out.print("Enter row1 : ");
        int row1 = sc.nextInt();
        System.out.print("Enter col1 : ");
        int col1 = sc.nextInt();
        int matrix1[][] = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("Enter elements :" + "(" + (i + 1) + "," + (j + 1) + ") : ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatrix 1");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(matrix1[i][j] + "  ");
            }
            System.out.println();
        }

        // Order of Matri 2.
        System.out.println("Enter order for Matrix_2");
        System.out.print("Enter row2 : ");
        int row2 = sc.nextInt();
        System.out.print("Enter col2 : ");
        int col2 = sc.nextInt();
        int matrix2[][] = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("Enter elements :" + "(" + (i + 1) + "," + (j + 1) + ") : ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatrix 2");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(matrix2[i][j] + "  ");
            }
            System.out.println();
        }

        if (row1 == col2) {
            // multiplication of two matrix
            int result[][] = new int[row1][col2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    result[i][j] = 0;
                }
            }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("\nProduct of two Matrix ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplication is not Possible row1 must equal to col2");
        }

        // // multiplication of two matrix
        // int result[][] = new int[row1][col2];
        // for(int i=0;i<row1;i++){
        // for(int j=0;j<col2;j++){
        // result[i][j] = 0;
        // }
        // }
        // for(int i=0;i<row1;i++){
        // for(int j=0;j<col2;j++){
        // for(int k=0;k<col1;k++){
        // result[i][j] += matrix1[i][k] * matrix2[k][j];
        // }
        // }
        // }

        // System.out.println("\nProduct of two Matrix ");
        // for(int i=0;i<row1;i++){
        // for(int j=0;j<col2;j++){
        // System.out.print(result[i][j]+" ");
        // }
        // System.out.println();
        // }
        sc.close();
    }
}
