import java.util.Scanner;

public class KmToMiles{
	public static void main(String[] args){
		//user inputs
		Scanner input = new Scanner(System.in);
		//inputting kilometres
		int km = input.nextInt();
		//Converting to miles
		double miles = km * 1.6;
		System.out.printf("The total miles is %.2f mile for the given %d km",miles, km);
	input.close();
	}
}