package extras;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Input date
        LocalDate inputDate = LocalDate.of(2023, 4, 17); // Example date: 17th April 2023

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = inputDate.plusDays(7)
                                        .plusMonths(1)
                                        .plusYears(2);

        // Subtract 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        // Output the result
        System.out.println("Input Date: " + inputDate);
        System.out.println("Updated Date: " + updatedDate);
    }
}
