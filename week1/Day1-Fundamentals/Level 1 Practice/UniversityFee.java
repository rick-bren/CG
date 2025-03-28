public class UniversityFee{
	public static void main(String[] args){
		//Input details
		int studentFee = 125000;
		int discountPercent = 10;
		
		//Calculate discount
		double discount = (studentFee * discountPercent)/100;
		double studentFeeDiscounted = studentFee - discount;
		
		//Displaying the final price after discount
		System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f", discount, studentFeeDiscounted);
	}
}