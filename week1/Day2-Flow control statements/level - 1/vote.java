import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
	    Scanner Input = new Scanner(System.in);
		System.out.print("Enter age");
		double age = Input.nextDouble();
		if (age>=18) {
		    System.out.println("The person's age is "+age+" and can vote ");
		} else {
		    System.out.println("The person's age is "+age+" and cannot vote");
			}
	}
}