import java.util.Scanner;

public class bonussal {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter salary");
		double sal = input.nextDouble();
		double bonus = 0;
		double totalsal = 0;
		System.out.println("Enter years of service");
		int year = input.nextInt();
		if (year>5) {
		    bonus = 0.05*sal;
			System.out.println("Eligible for bonus= "+bonus);
			System.out.println("Total salary= "+(bonus+sal));
		} else {
		    System.out.println("Not Eligible for bonus ");
		}
	}
}