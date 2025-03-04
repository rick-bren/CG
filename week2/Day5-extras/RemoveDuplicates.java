package extras;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!seen.contains(c)) {
                result.append(c);
                seen.add(c);
            }
        }

        System.out.println("Modified string: " + result.toString());
    }
}
