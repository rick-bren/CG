package extras;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = getInput("Enter a string: ");
        boolean isPalindrome = checkPalindrome(input);
        displayResult(isPalindrome);
    }

    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
    }

    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(boolean result) {
        if (result) System.out.println("The string is a palindrome.");
        else System.out.println("The string is not a palindrome.");
    }
}
