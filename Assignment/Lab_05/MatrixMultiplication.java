package Lab_05;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix: ");
        int row1 = sc.nextInt();
        
        System.out.println("Enter the number of columns for the first matrix: ");
        int col1 = sc.nextInt();
        
        System.out.println("Enter the number of rows for the second matrix: ");
        int row2 = sc.nextInt();
        
        System.out.println("Enter the number of columns for the second matrix: ");
        int col2 = sc.nextInt();
        
        // Check for positive dimensions
        if (row1 <= 0 || col1 <= 0 || row2 <= 0 || col2 <= 0) {
            System.out.println("Error: Matrix dimensions must be positive integers.");
            sc.close();
            return;
        }
        
        // Check for matching dimensions for matrix multiplication
        if (col1 != row2) {
            System.out.println("Error: The number of columns of the first matrix must equal the number of rows of the second matrix.");
            sc.close();
            return;
        }

        // Initialize and fill the first matrix
        int[][] matrix1 = new int[row1][col1];
        System.out.println("Enter elements of the first matrix: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.println("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        // Initialize and fill the second matrix
        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter elements of the second matrix: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Initialize the result matrix
        int[][] result = new int[row1][col2];

        // Perform matrix multiplication using nested while loops
        int i = 0;
        while (i < row1) {
            int j = 0;
            while (j < col2) {
                int k = 0;
                while (k < col1) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                    k++;
                }
                j++;
            }
            i++;
        }

        // Display the product matrix
        System.out.println("Product of the matrices: ");
        i = 0;
        while (i < row1) {
            int j = 0;
            while (j < col2) {
                System.out.print(result[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        
        sc.close();
    }
}
