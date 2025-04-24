
public class ReverseString {
    public static String reverseUsingStringBuilder(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);           // Append the input string
        sb.reverse();               // Reverse the contents
        return sb.toString();       // Convert back to string
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseUsingStringBuilder(input);
        System.out.println("Reversed String: " + reversed);
    }
}

