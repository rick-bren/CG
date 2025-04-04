package extras;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        int number = getInput("Enter a number: ");
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static long calculateFactorial(int n) {
        if (n <= 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
