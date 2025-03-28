import java.util.Scanner;

public class maxHandshakes {
    public double hand( double n) {
	    double f = (n*(n-1))/2;
		return f;
	}
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter no.of students");
		double n = input.nextDouble();
		maxHandshakes maxHandshakes = new maxHandshakes();
		double f = maxHandshakes.hand(n);
		System.out.println(f);
	input.close();
	}
}		