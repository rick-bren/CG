import java.util.Scanner;

public class sumnnaturalfor {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		double sum1=0;
		double sum2=0;
		System.out.println("Enter a number: ");
		double num=input.nextDouble();
		for (int i=0;i<=num;i++) {
			sum1=sum1+i;	
		}
		sum2 = num*(num+1)/2;
		if (sum1==sum2) {
		    System.out.println("Sum1= "+sum1+" and Sum2= "+sum2+" are equal");
		} else {
		    System.out.println("Sum1= "+sum1+" and Sum2= "+sum2+" are not equal");
		}
	}
}