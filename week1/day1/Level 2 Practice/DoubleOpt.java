import java.util.Scanner;

public class DoubleOpt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//gathering user inputs
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//integer operations
		double doubleOperation1 = a + b * c;
		double doubleOperation2 = a * b + c;
		double doubleOperation3 = c + a / b;
		double doubleOperation4 = a % b + c;
		
		//Displaying the output
		
		System.out.printf("The results of the Double Operations are:%n(a+b*c) = %.2f%n(a*b+c) = %.2f%n(c+a/b) = %.2f%n(a%%b+c) = %.2f%n", doubleOperation1, doubleOperation2, doubleOperation3, doubleOperation4);
	input.close();
	}
}
