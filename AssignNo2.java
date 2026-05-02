import java.util.Scanner;

class AssignNo2 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
        // Ask user for dimension of square matrix
        System.out.print("Enter size of square matrix: ");
        int n = input.nextInt();
    
        int[][] matrix = new int[n][n];
    
        // Taking input for matrix elements
        System.out.println("Enter matrix elements:");
    
        for (int i = 0; i < n; i++) {           // loop for rows
            for (int j = 0; j < n; j++) {       // loop for columns
                matrix[i][j] = input.nextInt();
            }
        }
    
        // Sum of each row
        System.out.println("\nSum of each row:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
    
            for (int j = 0; j < n; j++) {
                rowSum = rowSum + matrix[i][j];
            }
    
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }
    
        // Sum of each column
        System.out.println("\nSum of each column:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
    
            for (int i = 0; i < n; i++) {
                colSum = colSum + matrix[i][j];
            }
    
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }
    
        // Sum of main diagonal elements
        int diagonalSum = 0;
    
        for (int i = 0; i < n; i++) {
            diagonalSum = diagonalSum + matrix[i][i];
        }
    
        System.out.println("\nSum of diagonal elements = " + diagonalSum);
    
        // Sum of reverse diagonal elements
        int reverseDiagonalSum = 0;
    
        for (int i = 0; i < n; i++) {
            reverseDiagonalSum = reverseDiagonalSum + matrix[i][n - 1 - i];
        }
    
        System.out.println("Sum of reverse diagonal elements = " + reverseDiagonalSum);
    
        input.close();
    }
}