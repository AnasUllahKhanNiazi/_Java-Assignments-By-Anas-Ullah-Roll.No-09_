import java.util.Scanner;

class AssignNo6_Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ======================== Matrices Operation ====================== //
        // ======================== OBJECT 1 (ADDITION - INPUT) ======================== //
        /*
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        System.out.println("Enter the Element of Matrix A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the Element of Matrix B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Addition Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        */

        // ======================== OBJECT 1 (ADDITION - GIVEN MATRIX) ======================== //
        /*
        int[][] D = {{9,7,8},{5,6,7},{1,3,5}};
        int[][] E = {{2,4,1},{2,3,1},{0,1,3}};
        int[][] F = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                F[i][j] = D[i][j] + E[i][j];
            }
        }

        System.out.println("Addition Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(F[i][j] + " ");
            }
            System.out.println();
        }
        */

        // ======================== OBJECT 2 (SUBTRACTION - INPUT) ======================== //
        /*
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                A[i][j] = input.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                B[i][j] = input.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                C[i][j] = A[i][j] - B[i][j];

        System.out.println("Subtraction Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        */

        // ======================== OBJECT 2 (SUBTRACTION - GIVEN MATRIX) ======================== //
        /*
        int[][] D = {{9,7,8},{5,6,7},{1,3,5}};
        int[][] E = {{2,4,1},{2,3,1},{0,1,3}};
        int[][] F = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                F[i][j] = D[i][j] - E[i][j];

        System.out.println("Subtraction Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(F[i][j] + " ");
            }
            System.out.println();
        }
        */

        // ======================== OBJECT 3 (MULTIPLICATION) ======================== //
        /*
        int[][] D = {{9,7,8},{5,6,7},{1,3,5}};
        int[][] E = {{2,4,1},{2,3,1},{0,1,3}};
        int[][] F = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    F[i][j] += D[i][k] * E[k][j];
                }
            }
        }

        System.out.println("Multiplication Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(F[i][j] + " ");
            }
            System.out.println();
        }
        */

        // ======================== OBJECT 4 (SUM OF ALL ELEMENTS) ======================== //
        /*
        int[][] A = {
            {1,2,3},{4,5,6},{7,8,9}
        };

        int SumOfAllElements = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                SumOfAllElements += A[i][j];
            }
        }

        System.out.print("Sum of All Elements = " + SumOfAllElements);
        */

        // ======================== OBJECT 7 (TRANSPOSE) ======================== //
        /*
        int[][] A = {
            {1,2,3},{4,5,6},{7,8,9}
        };

        int[][] Transpose = new int[3][3];

        System.out.println("Original Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Transpose[j][i] = A[i][j];
            }
        }

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
        */

        // ======================== OBJECT 6 (MATHEMATICAL OPERATIONS ON MATRIX) ======================== //
        /*
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{9,8,7},{6,5,4},{3,2,1}};

        int[][] Add = new int[3][3];
        int[][] Sub = new int[3][3];
        int[][] Mul = new int[3][3];

        // Addition
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                Add[i][j] = A[i][j] + B[i][j];

        // Subtraction
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                Sub[i][j] = A[i][j] - B[i][j];

        // Multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mul[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    Mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(Add[i][j] + " ");
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(Sub[i][j] + " ");
            System.out.println();
        }

        System.out.println("Multiplication:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(Mul[i][j] + " ");
            System.out.println();
        }
        */

        // ======================== OBJECT 7 (SUM OF DIAGONALS) ======================== //
        /*
        int[][] A = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            primaryDiagonal += A[i][i];
            secondaryDiagonal += A[i][2 - i];
        }

        System.out.println("Primary Diagonal Sum = " + primaryDiagonal);
        System.out.println("Secondary Diagonal Sum = " + secondaryDiagonal);
        */

        // ======================== OBJECT 8 (MAGIC SQUARE) ======================== //
        /*
        int[][] A = {
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };

        int n = A.length;
        int sum = 0;

        for (int j = 0; j < n; j++) sum += A[0][j];

        boolean IsMagic = true;

        for (int i = 0; i < n; i++) {
            int RowSum = 0;
            for (int j = 0; j < n; j++) RowSum += A[i][j];
            if (RowSum != sum) IsMagic = false;
        }

        for (int j = 0; j < n; j++) {
            int ColSum = 0;
            for (int i = 0; i < n; i++) ColSum += A[i][j];
            if (ColSum != sum) IsMagic = false;
        }

        int DiagonalSum = 0, ReverseDiaSum = 0;

        for (int i = 0; i < n; i++) {
            DiagonalSum += A[i][i];
            ReverseDiaSum += A[i][n - i - 1];
        }

        if (DiagonalSum != sum || ReverseDiaSum != sum)
            IsMagic = false;

        if (IsMagic)
            System.out.println("Magic Square Matrix");
        else
            System.out.println("Not Magic Square Matrix");
        */

        // ======================== OBJECT 9 (SIMULTANEOUS EQUATIONS) ======================== //
        /*
        double a1,b1,c1,d1;
        double a2,b2,c2,d2;
        double a3,b3,c3,d3;

        System.out.println("Enter equation 1:");
        a1 = input.nextDouble(); b1 = input.nextDouble();
        c1 = input.nextDouble(); d1 = input.nextDouble();

        System.out.println("Enter equation 2:");
        a2 = input.nextDouble(); b2 = input.nextDouble();
        c2 = input.nextDouble(); d2 = input.nextDouble();

        System.out.println("Enter equation 3:");
        a3 = input.nextDouble(); b3 = input.nextDouble();
        c3 = input.nextDouble(); d3 = input.nextDouble();

        double r2 = a2 / a1;
        double r3 = a3 / a1;

        b2 -= r2 * b1;
        c2 -= r2 * c1;
        d2 -= r2 * d1;

        b3 -= r3 * b1;
        c3 -= r3 * c1;
        d3 -= r3 * d1;

        double r = b3 / b2;

        c3 -= r * c2;
        d3 -= r * d2;

        double z = d3 / c3;
        double y = (d2 - c2 * z) / b2;
        double x = (d1 - b1 * y - c1 * z) / a1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        */
        


        /*=================================================================== */
        // =========== Functions (Use of Parameter and Argumens) =========== //
        // ================ OBJECT 10 (Sum And Average) ==================== //
        
        // For Addition Calculation //
        System.out.print("Enter How Many Numbers you want to Add = ");
        int n = input.nextInt();
        double Sum = 0;
        
        System.out.println("Enter " + n + " Numbers");
        for (int i = 1; i <= n; i++) {
            double Num = input.nextDouble();
            Sum += Num;
        }
        System.out.println("Total Sum = "+Sum);
        
        // For Average Calculations //
        double Average = Sum / n;
        System.out.println("Average = "+Average);
    }
}