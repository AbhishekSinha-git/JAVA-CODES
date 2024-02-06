// Main.java

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputmethods {
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Command Line Args");
            System.out.println("2. Scanner");
            System.out.println("3. BufferedReader");
            System.out.println("4. DataInputStream");
            System.out.println("5. Console");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = getUserInput();

            switch (choice) {
                case 1:
                    commandLineArgs(args);
                    break;
                case 2:
                    scannerInput();
                    break;
                case 3:
                    bufferedReaderInput();
                    break;
                case 4:
                    dataInputStreamInput();
                    break;
                case 5:
                    consoleInput();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }

    private static int getUserInput() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading input. Please try again.");
            return -1;
        }
    }

    private static void commandLineArgs(String[] args) {
        System.out.println("Command Line Args: ");
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    private static void scannerInput() {
        System.out.println("Scanner Input: ");
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a value: ");
            String input = scanner.nextLine();
            System.out.println("You entered: " + input);
        } catch (Exception e) {
            System.out.println("Error reading input. Please try again.");
        }
    }

    private static void bufferedReaderInput() {
        System.out.println("BufferedReader Input: ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a value: ");
            String input = reader.readLine();
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            System.out.println("Error reading input. Please try again.");
        }
    }

    private static void dataInputStreamInput() {
        System.out.println("DataInputStream Input: ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a value: ");
            String input = reader.readLine();
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            System.out.println("Error reading input. Please try again.");
        }
    }

    private static void consoleInput() {
        System.out.println("Console Input: ");
        Console console = System.console();
        if (console != null) {
            String input = console.readLine("Enter a value: ");
            System.out.println("You entered: " + input);
        } else {
            System.out.println("Console is not available. Cannot read input.");
        }
    }
}
