import java.util.Scanner;

public class ifnot0add {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		double a = -1;
		double total = 0;
		while(a!=0) {
			System.out.println("Enter a number(0 to stop): ");
			a = input.nextDouble();
		    if (a!=0){
			    total = total+a;
			}
		}
	System.out.println("Total Sum = "+total);
	}
}