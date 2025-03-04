package extras;

import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        int minLength = Math.min(str1.length(), str2.length());
        int comparisonResult = 0;
        
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            
            if (char1 < char2) {
                comparisonResult = -1; // str1 is lexicographically smaller
                break;
            } else if (char1 > char2) {
                comparisonResult = 1; // str1 is lexicographically greater
                break;
            }
        }
        
        // If no difference found till the minimum length, compare the string lengths
        if (comparisonResult == 0) {
            if (str1.length() < str2.length()) {
                comparisonResult = -1; // str1 is lexicographically smaller
            } else if (str1.length() > str2.length()) {
                comparisonResult = 1; // str1 is lexicographically greater
            }
        }
        
        if (comparisonResult == -1) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (comparisonResult == 1) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("The strings are equal.");
        }
    }
}
