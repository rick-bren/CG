import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
	    Scanner Input = new Scanner(System.in);
		System.out.print("Enter a no.");
		double n1 = Input.nextDouble();
		System.out.print("Is the number "+n1+" divisible by 5? "+ (n1%5==0));
	}
}
		