import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
		double Principal = scanner.nextDouble();
		System.out.println("Enter Rate of Interest:");
		double Rate = scanner.nextDouble();
		System.out.println("Enter Time:");
		double Time = scanner.nextDouble();
		double SI = (Principal*Rate*Time)/100;
        System.out.println("The Simple Interest is "+SI+" for Principal "+Principal+" ,Rate "+Rate+" and Time "+Time);
    scanner.close();
	}
}