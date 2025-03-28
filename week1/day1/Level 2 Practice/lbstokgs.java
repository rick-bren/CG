import java.util.Scanner;

public class lbstokgs {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weight in pounds");
		double Weightinlbs = scanner.nextDouble();
		double Weightinkgs = Weightinlbs / 2.2;
		System.out.println("The weight of the person in pound is "+Weightinlbs+"lbs and in kg is "+Weightinkgs+"kg");
	scanner.close();
	}
}