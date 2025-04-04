package extras;

import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();
        
        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        System.out.println("The substring occurs " + count + " times.");
        scanner.close();
    }
}
