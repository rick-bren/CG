import java.util.Scanner;

public class age {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the student's age: ");
		int[] age = new int[10];
		for (int i=0; i<10; i++) {
		    age[i] = input.nextInt();
			if (age[i]>=18) {
			   System.out.println("eligible ");			   
			} else {
			    System.out.println("not eligible ");
			}
		}
		input.close();
	}
}