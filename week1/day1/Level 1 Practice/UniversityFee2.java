import java.util.Scanner;

public class UniversityFee2{
	public static void main(String[] args){
		//Taking input from user
		Scanner input = new Scanner(System.in);
		//Inputting student fee
		int fee = input.nextInt();
		//Inputting discount percent
		int discountPercent = input.nextInt();
		//Calculate discount
		double discount = (fee * discountPercent)/100;
		double studentFeeDiscounted = fee - discount;
		
		//Displaying the final price after discount
		System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f", discount, studentFeeDiscounted);
	input.close();
	}
}