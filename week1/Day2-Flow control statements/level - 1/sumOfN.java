import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
	    Scanner Input = new Scanner(System.in);
		System.out.print("Enter a no.");
		double n = Input.nextDouble();
		if (n>=0) {
		    System.out.println("The sum of "+n+" natural numbers is "+ (n*n+1)/2);
		} else {
		    System.out.println("The number "+n+" is not a natural number");
			}
	}
}