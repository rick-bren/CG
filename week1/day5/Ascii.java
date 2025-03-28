import java.util.Scanner;

class Ascii {
  // Method to find the characters and their ASCII values in a string and 
  // return them in a 2D array
  public static int[][] findASCIIValues(String text) {
      int[][] charASCIIValues = new int[text.length()][2];

      for (int i = 0; i < text.length(); i++) {
          charASCIIValues[i][0] = text.charAt(i);
          charASCIIValues[i][1] = text.charAt(i);
      }

      return charASCIIValues;
  }
    
  // Method to display the characters and their ASCII values in a string
  public static void displayASCIIValues(String text, int[][] charASCIIValues) {
      System.out.println("Characters and their corresponding ASCII values " + 
                         "for " + text + " is:");
      for (int i = 0; i < charASCIIValues.length; i++) {
          System.out.println((char)charASCIIValues[i][0] + "-" + 
                             charASCIIValues[i][1]);
      }
  }  

  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);	
    String text = sc.nextLine();
    int[][] charASCIIValues = findASCIIValues(text.trim());        
    displayASCIIValues(text, charASCIIValues);
    sc.close();
  }
}
