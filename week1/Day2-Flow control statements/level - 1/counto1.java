import java.util.Scanner;

public class counto1 {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		while(n>0) {
		    System.out.println(n);
			n=n-1;
		}
	}
}