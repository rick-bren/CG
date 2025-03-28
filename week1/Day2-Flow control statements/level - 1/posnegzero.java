import java.util.Scanner;

public class posnegzero {
    public static void main(String[] args) {
	    Scanner Input = new Scanner(System.in);
		System.out.print("Enter a no.");
		double n = Input.nextDouble();
		if (n>0) {
		    System.out.println("positive");
		} else if (n==0) {
		    System.out.println("zero");
			} else {
				    System.out.println("negative");
			}
	}
}