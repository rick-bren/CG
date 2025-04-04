package extras;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "success";
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        char mostFrequentChar = '\0';
        int maxCount = 0;
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
