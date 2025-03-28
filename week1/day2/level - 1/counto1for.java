import java.util.Scanner;

public class counto1for {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		for(int i=n; i>0; i--) {
		    System.out.println(i);
		}
	}
}