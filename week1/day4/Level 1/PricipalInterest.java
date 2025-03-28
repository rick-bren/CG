import java.util.Scanner;

public class PricipalInterest {
    public double pnr(double p,double r,double t) { 
	    double SI = p*r*t/100.0;
		return SI;
	}
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter Principal");
		double p = input.nextDouble();
		System.out.println("Enter Rate");
		double r = input.nextDouble();
		System.out.println("Enter Time");
		double t = input.nextDouble();
		PricipalInterest pricipalInterest = new PricipalInterest();
		double SI = pricipalInterest.pnr(p,r,t);
		System.out.println(SI);
		input.close();
	}
}