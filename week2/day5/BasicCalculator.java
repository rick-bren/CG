package extras;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '-':
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '*':
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }

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
        return a / b;
    }
}
