import java.util.Scanner;

public class multable {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter a no.");
		int num = input.nextInt();
		for (int i=1;i<=num;i++) {
		    System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}