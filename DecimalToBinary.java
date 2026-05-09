import java.util.Scanner;
class DecimalToBinary {
//    public static void main(String[] args){
//        Scanner read = new Scanner (System.in);
//
//        System.out.print("Enter an Integer Number: ");
//        int number = read.nextInt();
//
//        String binary = Integer.toBinaryString(number);
//
//            System.out.println("Binary: "+binary);

            //out put of the given function//

            //Test Case Number 1 (26)//
            //Enter an Integer Number: 26
            //Binary: 11010

            //Test Case Number 2 (27)//
            //Enter an Integer Number: 27
            //Binary: 11011

            //Test Case Number 3 (32)//
            //Enter an Integer Number: 32
            //Binary: 100000


    // Function returns binary digits in integer array
//    public static int[] toBinaryArray(int number) {
//
//        String binary = Integer.toBinaryString(number);
//
//        int[] result = new int[binary.length()];
//
//        for (int i = 0; i < binary.length(); i++) {
//            result[i] = binary.charAt(i) - '0';
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an Integer Number: ");
//        int number = input.nextInt();
//
//        int[] binary = toBinaryArray(number);
//
//        System.out.print("Binary: ");
//        for (int digit : binary) {
//            System.out.print(digit);
//        }
//
//        input.close();
//
//        //output of this function//
//        //Enter an Integer Number: 23
//        //Binary: 10111

    public static String toBinaryString(int number) {
    
        return Integer.toBinaryString(number);
    }
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer Number!: ");
        int number = input.nextInt();
    
        String binary = toBinaryString(number);
    
        System.out.println("Binary: " + binary);
    
        input.close();
    }
}