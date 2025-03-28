import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Getting input from the user
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        // Calculating quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        // Displaying the output
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder +
                " for the numbers " + dividend + " and " + divisor);
        scanner.close();
    }
}