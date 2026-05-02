import java.util.Scanner;

class AssignNo5 {
            // Function to calculate x^k mod n
    public static long modExp(long Mi, long e, long n) {
        long y = 1;  // Step 2: Initialize y to 1


        // Step 1: Convert exponent k to binary representation
        String binaryK = Long.toBinaryString(e);
        int t = binaryK.length();


        // Step 3: Iterate from most significant bit to least
        for (int i = 0; i < t; i++) {
            y = (y * y) % n;  // Step 3a: y = y^2 mod n


            if (binaryK.charAt(i) == '1') {  // Step 3b: if bit is 1
                y = (y * Mi) % n;
            }
        }
        return y;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter base Mi: ");
        long Mi = scanner.nextLong();


        System.out.print("Enter exponent e: ");
        long e = scanner.nextLong();


        System.out.print("Enter modulus n: ");
        long n = scanner.nextLong();


        long result = modExp(Mi, e, n);
        System.out.println("Mi^e mod n = Ci");
        System.out.println(Mi + "^" + e + " mod " + n + " = " + result);
    }
}