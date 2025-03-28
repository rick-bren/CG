import java.util.Scanner;

public class TotalPrice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//Getting input from the user 
	    double unitPrice = scanner.nextDouble();
		double quantity = scanner.nextDouble();
		//Calculating the total price of the item
		double TotalPrice = unitPrice * quantity;
		//Displaying the result 
		System.out.println("The total purchase price is INR " + TotalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	scanner.close();
	}
}