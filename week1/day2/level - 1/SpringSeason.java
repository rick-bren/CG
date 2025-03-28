import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
	    Scanner Input = new Scanner(System.in);
		System.out.println("Enter month number");
		int month = Input.nextInt();
		System.out.println("Enter date");
		int date = Input.nextInt();
		boolean isspring = (month>=3 && date>=20) || (month<7 && date<21);
		if (isspring) {
		    System.out.print("Its a Spring Season");
		} else {
		    System.out.print("Its not a Spring Season");
		}
	}
}