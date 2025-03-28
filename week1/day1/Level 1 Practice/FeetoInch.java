import java.util.Scanner;

public class FeetoInch {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		//User input for height in foot
		System.out.println("Enter height in foot:");
		double heightinFoot = scanner.nextDouble();
		//Converting height to Inches
		double heightinInches = heightinFoot * 12;
		//Converting height to Centimeters
		double heightinCms = heightinInches * 2.54;
		System.out.println("Your Height in cm is " + heightinCms + " while in feet is " 
		+ heightinFoot + " and in inches is " + heightinInches);
		scanner.close();
	}
}	