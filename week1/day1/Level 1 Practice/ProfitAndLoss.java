public class ProfitAndLoss{
	public static void main(String[] args){
		//Entering CP and SP
		int costPrice = 129;
		int sellingPrice = 191;
		
		//Calculate Profit and Profit %
		double calcProfit = sellingPrice - costPrice;
		double calcProfitPercent = (calcProfit/costPrice) * 100;
		
		//Displaying Profit and Profit %
		System.out.printf("The Cost Price is INR %d and Selling Price is INR %d%nThe Profit is INR %.2f and the Profit Percentage is %.2f%%%n", 
                          costPrice, sellingPrice, calcProfit, calcProfitPercent);
					    }
}