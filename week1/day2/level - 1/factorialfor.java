import java.util.Scanner;

public class factorialfor {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		double fact=1;
		System.out.println("Enter a number: ");
		double num=input.nextDouble();
		for (int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of the is number: "+fact);
	}
}