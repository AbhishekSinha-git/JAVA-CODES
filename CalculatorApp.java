// CalculatorApp.java

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performOperation(scanner, Calculator::add);
                    break;
                case 2:
                    performOperation(scanner, Calculator::subtract);
                    break;
                case 3:
                    performOperation(scanner, Calculator::multiply);
                    break;
                case 4:
                    performOperation(scanner, Calculator::divide);
                    break;
                case 5:
                    performUnaryOperation(scanner, Calculator::sqrt);
                    break;
                case 6:
                    performBinaryOperation(scanner, Calculator::power);
                    break;
                case 7:
                    calculateMean(scanner, numbers);
                    break;
                case 8:
                    calculateVariance(scanner, numbers);
                    break;
                case 0:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }

    private static void performOperation(Scanner scanner, BinaryOperation operation) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double result = operation.calculate(a, b);
        System.out.println("Result: " + result);
    }

    private static void performUnaryOperation(Scanner scanner, UnaryOperation operation) {
        System.out.print("Enter number: ");
        double a = scanner.nextDouble();
        double result = operation.calculate(a);
        System.out.println("Result: " + result);
    }

    private static void performBinaryOperation(Scanner scanner, BinaryOperation operation) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = operation.calculate(base, exponent);
        System.out.println("Result: " + result);
    }

    private static void calculateMean(Scanner scanner, ArrayList<Double> numbers) {
        scanner.nextLine(); // Consume the newline character left by the previous nextDouble()
        System.out.println("Enter numbers (type 'end' to finish):");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("end")) {
            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to finish.");
            }
        }
        double mean = Calculator.mean(numbers);
        System.out.println("Mean: " + mean);
        numbers.clear(); // Clear the list for the next set of numbers
    }

    private static void calculateVariance(Scanner scanner, ArrayList<Double> numbers) {
        scanner.nextLine(); // Consume the newline character left by the previous nextDouble()
        System.out.println("Enter numbers (type 'end' to finish):");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("end")) {
            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to finish.");
            }
        }
        double variance = Calculator.variance(numbers);
        System.out.println("Variance: " + variance);
        numbers.clear(); // Clear the list for the next set of numbers
    }

    interface BinaryOperation {
        double calculate(double a, double b);
    }

    interface UnaryOperation {
        double calculate(double a);
    }
}
