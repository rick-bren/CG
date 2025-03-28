import java.util.Scanner;

public class FeettoYardnMiles{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//Getting input from the user 
	    double distanceInFeet = scanner.nextInt();
		//Calculating the value of both yard and miles 
		double yard = distanceInFeet / 3;
		double mile = yard / 1760;
		//Displaying the result 
		System.out.println("The distance in feet is " + distanceInFeet + " and in yards it is " + yard + " and in miles it is " + mile);
	scanner.close();
	}
}