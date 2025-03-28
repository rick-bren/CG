import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		boolean isleap=(year%400==0);
		boolean leap=(year%4==0) || (year%100==0);
		boolean lp= isleap && leap;
		if (lp) {
		    System.out.println(year+" is a leap year");
		} else {
            System.out.println(year+" is not a leap year");
        input.close();
		}
    }
}	