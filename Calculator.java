// Calculator.java

import java.util.ArrayList;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN;
        }
    }

    public static double sqrt(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println("Error: Cannot calculate square root of a negative number");
            return Double.NaN;
        }
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double mean(ArrayList<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    public static double variance(ArrayList<Double> numbers) {
        double mean = mean(numbers);
        double sumSquaredDiff = 0;

        for (double num : numbers) {
            double diff = num - mean;
            sumSquaredDiff += Math.pow(diff, 2);
        }

        return sumSquaredDiff / numbers.size();
    }
}
