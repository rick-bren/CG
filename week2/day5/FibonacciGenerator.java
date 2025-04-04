package extras;

import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        int terms = getInput("Enter number of terms: ");
        generateFibonacci(terms);
    }

    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
