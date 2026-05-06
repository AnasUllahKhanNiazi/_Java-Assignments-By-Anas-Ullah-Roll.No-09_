import java.util.Arrays;
import java.util.Scanner;

class AssignNo6_Func {

    /* ==========================================================
       OBJECT 10 → Sum and Average Function
       ========================================================== */
//    public static double[] Sum_Average (int n){
//        Scanner input = new Scanner (System.in);
//        double Sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter number " + i + ": ");
//            double Num = input.nextDouble();
//            Sum += Num;
//        }
//
//        double Average = Sum / n;
//        return new double[]{Sum, Average};
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//
//        System.out.print("Enter How Many Numbers You Want To Add & Their Average: ");
//        int n = input.nextInt();
//
//        double[] z = Sum_Average(n);
//
//        System.out.println("Sum = " + z[0]);
//        System.out.println("Average = " + z[1]);
//    }



    /* ==========================================================
       OBJECT 11 → Student Result System
       ========================================================== */
//    public static int Calc_Total(int PF, int Maths, int Phy, int Eng, int ICT, int Islt){
//        return PF + Maths + Phy + Eng + ICT + Islt;
//    }
//
//    public static double Calc_Average(int Total){
//        return (Total / 600.0) * 100;
//    }
//
//    public static String Calc_Grade(double Percentage){
//        if (Percentage >= 80) return "+A";
//        else if (Percentage >= 70) return "A";
//        else if (Percentage >= 60) return "B";
//        else if (Percentage >= 50) return "C";
//        else if (Percentage >= 40) return "D";
//        else return "Fails";
//    }
//
//    public static double Calc_CGPA(double Percentage) {
//        if (Percentage >= 80) return 4.0;
//        else if (Percentage >= 70) return 3.5;
//        else if (Percentage >= 60) return 3.0;
//        else if (Percentage >= 50) return 2.5;
//        else if (Percentage >= 40) return 2.0;
//        else return 0.0;
//    }
//
//    public static void Display(String Name, int Total, double Percentage, double CGPA, String Grade) {
//        System.out.println("\n--- STUDENT RESULT ---");
//        System.out.println("NAME: " + Name);
//        System.out.println("TOTAL MARKS: " + Total);
//        System.out.println("PERCENTAGE: " + Percentage);
//        System.out.println("GRADE POINTS: " + CGPA);
//        System.out.println("GRADE: " + Grade);
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//
//        System.out.print("Enter Student Name: ");
//        String Name = input.nextLine();
//
//        System.out.print("Enter Marks Of Programming: ");
//        int PF = input.nextInt();
//        System.out.print("Enter Marks Of Mathematics: ");
//        int Maths = input.nextInt();
//        System.out.print("Enter Marks Of Physics: ");
//        int Phy = input.nextInt();
//        System.out.print("Enter Marks of English: ");
//        int Eng = input.nextInt();
//        System.out.print("Enter Marks of Information Tech: ");
//        int ICT = input.nextInt();
//        System.out.print("Enter Marks of Islamiaat: ");
//        int Islt = input.nextInt();
//
//        int Total = Calc_Total(PF, Maths, Phy, Eng, ICT, Islt);
//        double Percentage = Calc_Average(Total);
//        double CGPA = Calc_CGPA(Percentage);
//        String Grade = Calc_Grade(Percentage);
//
//        Display(Name, Total, Percentage, CGPA, Grade);
//
//        input.close();
//    }



    /* ==========================================================
       OBJECT 12 → Matrix Addition
       ========================================================== */
//    public static int[][] Add_Matrix(int N, Scanner input){
//
//        int[][] Matrix_A = new int[N][N];
//        int[][] Matrix_B = new int[N][N];
//        int[][] Matrix_C = new int[N][N];
//
//        System.out.println("Matrix_A Input:");
//        for(int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                Matrix_A[i][j] = input.nextInt();
//            }
//        }
//
//        System.out.println("Matrix_B Input:");
//        for(int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                Matrix_B[i][j] = input.nextInt();
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                Matrix_C[i][j] = Matrix_A[i][j] + Matrix_B[i][j];
//            }
//        }
//
//        return Matrix_C;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter The Length Of Matrix N x N: ");
//        int N = input.nextInt();
//
//        int[][] Result = Add_Matrix(N, input);
//
//        System.out.println("Resultant Matrix is given below:");
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(Result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }



    /* ==========================================================
       OBJECT 13 → Factorial Function
       ========================================================== */
//    public static long Calc_Factorial(int n){
//        long Factorial = 1;
//
//        for (int i = 1; i <= n; i++) {
//            Factorial *= i;
//        }
//
//        return Factorial;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//
//        System.out.print("Enter the Number You Want to Calculate Factorial: ");
//        int n = input.nextInt();
//
//        if (n < 0){
//            System.out.println("Factorial is not defined for negative numbers.");
//        } else {
//            long Result = Calc_Factorial(n);
//            System.out.println("The Factorial Of " + n + " is " + Result);
//        }
//    }



    /* ==========================================================
       OBJECT 14 → Prime Number Check
       ========================================================== */
//    public static void Check_Prime(int n){
//
//        if(n <= 1){
//            System.out.print("==> " + n + " <== It's not a PRIME NUMBER!");
//            return;
//        }
//
//        for (int i = 2; i < n; i++) {
//            if(n % i == 0){
//                System.out.print("==> " + n + " <== It's not a PRIME NUMBER!");
//                return;
//            }
//        }
//
//        System.out.print("==> " + n + " <== It is a PRIME NUMBER!");
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the Number: ");
//        int n = input.nextInt();
//
//        Check_Prime(n);
//    }



    /* ==========================================================
       OBJECT 15 → Hamming Codes
       ========================================================== */
    public static String[] HammingCodes(String[] arr) {

        int n = arr.length;
        int power = 0;
        int count = 1;

        while (true) {

            int index = (int) Math.pow(2, power);

            if (index > n)
                break;

            arr[index - 1] = "h" + count;

            power++;
            count++;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = input.nextInt();

        String[] arr = new String[n];
        Arrays.fill(arr, "d");

        String[] result = HammingCodes(arr);

        System.out.println("Output Array:");
        System.out.println(Arrays.toString(result));

        input.close();
    }
}