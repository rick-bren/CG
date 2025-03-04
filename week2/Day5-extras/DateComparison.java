package extras;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String date1Input = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date1Input);

        // Input the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String date2Input = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date2Input);

        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The two dates are the same.");
        }

        // Close the scanner
        scanner.close();
    }
}
