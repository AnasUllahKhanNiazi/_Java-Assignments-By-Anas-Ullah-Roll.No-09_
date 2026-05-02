import java.util.Arrays;
import java.util.Scanner;
class AssignNo3 {

    // Function as required
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

        // Take input from user
        System.out.print("Enter value of N: ");
        int n = input.nextInt();

        // Create array of size n
        String[] arr = new String[n];

        // Initialize with 'd'
        Arrays.fill(arr, "d");

        // Call function
        String[] result = HammingCodes(arr);

        // Print result
        System.out.println("Output Array:");
        System.out.println(Arrays.toString(result));

        input.close();
    }
}