import java.util.Scanner;

public class EvenOddArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declare arrays for even and odd numbers
        int[] even = new int[size];
        int[] odd = new int[size];

        // Counter variables for even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // Accept numbers from the user and move them to respective arrays
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                even[evenIndex++] = num;
            } else {
                odd[oddIndex++] = num;
            }
        }

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

