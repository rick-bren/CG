import java.util.Scanner;

public class ifnot0andnegativeadd {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		double a = 0;
		double total = 0;
		while (true) {
			System.out.println("Enter a number(0 or -ve to stop): ");
			a = input.nextDouble();
		    if (a<=0){
			    break;
			}
			total = total+a;
		}
	System.out.println("Total Sum = "+total);
	}
}