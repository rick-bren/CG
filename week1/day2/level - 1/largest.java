import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
	    Scanner Input = new Scanner(System.in);
		System.out.print("Enter 1st no.");
		double n1 = Input.nextDouble();
		System.out.print("Enter 2nd no.");
		double n2 = Input.nextDouble();
		System.out.print("Enter 3rd no.");
		double n3 = Input.nextDouble();
		System.out.printf("Is the first number the largest? %b",(n1>n2)&&(n1>n3));
		System.out.printf("\nIs the second number the largest? %b",(n2>n1)&&(n2>n3));
		System.out.printf("\nIs the third number the largest? %b",(n3>n1)&&(n3>n2));
	}
}
		