package extras;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "? (enter 'low', 'high', or 'correct')");
            String feedback = scanner.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! The computer guessed your number: " + guess);
                guessedCorrectly = true;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("It seems there was a mistake in the feedback. Try again!");
        }
    }

    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}
