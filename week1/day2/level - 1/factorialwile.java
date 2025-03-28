import java.util.Scanner;

public class factorialwile {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		double fact=1;
		System.out.println("Enter a number: ");
		double num=input.nextDouble();
		while (num>0) {
			fact*=num;
			num--;
		}
		System.out.println("Factorial of the is number: "+fact);
	}
}