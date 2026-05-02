import java.util.Scanner;

class AssignNo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ==============================
        // Question No: 01 (Using while)
        // ==============================

        /*
        int i = 1;
        while(i <= 5){
            System.out.print("*");
            i = i + 1;
        }
        System.out.println();
        */


        // ==============================
        // Question No: 01 (Using for)
        // ==============================

        /*
        int n = 5;
        for(int j = 1; j <= n; j = j + 1){
            System.out.print("*");
        }
        System.out.println();
        */


        // ==============================
        // Question No: 02
        // ==============================

        /*
        for(int i = 1; i <= 3; i = i + 1){
            for(int j = 1; j <= 5; j = j + 1){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // ==============================
        // Question No: 03
        // ==============================

        /*
        for(int i = 1; i <= 5; i = i + 1){
            for(int j = 1; j <= i; j = j + 1){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // ==============================
        // Question No: 04
        // ==============================

        /*
        System.out.print("No. of Rows of Stars: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i = i + 1){
            for(int j = 1; j <= i; j = j + 1){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // ==============================
        // Question No: 05
        // ==============================

        /*
        for(int i = 1; i <= 5; i = i + 1){
            for(int j = 1; j <= 5 - i + 1; j = j + 1){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // ==============================
        // Question No: 06
        // ==============================

        /*
        System.out.print("Number of Rows: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i = i + 1){
            for(int j = 1; j <= n - i + 1; j = j + 1){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // ==============================
        // Question No: 07
        // ==============================

        /*
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // ==============================
        // Question No: 08 (RUNNING)
        // ==============================

        /*
        System.out.print("Number of Rows: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            */

 //          for(int i=1; i<=5; i++){
 //              for(int j=1; j<=i; j++){
 //                  System.out.print(" * ");
 //              }System.out.println();
 //          }

 //          System.out.print("Enter the No of Rows: ");
 //          int rows = input.nextInt();
 //          for(int a=1; a<=rows; a=a+1){
 //          for(int b=1; b<=a; b=b+1){
 //          System.out.print(" % ");
 //          }System.out.println();
 //      }

        for(int i=1; i<=25; i++){
            for(int j=1; j<=25-i+1; j++){
                 System.out.print(" * ");
            }
            System.out.println();
        }
    }
}