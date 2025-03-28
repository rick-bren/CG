import java.util.Scanner;

public class IntOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//gathering user inputs
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		//integer operations
		int intOperation1 = a + b * c;
		int intOperation2 = a * b + c;
		int intOperation3 = c + a / b;
		int intOperation4 = a % b + c;
		
		//Displaying the output
		
		System.out.printf("The results of the Int Operations are:%n(a+b*c) = %d%n(a*b+c) = %d%n(c+a/b) = %d%n(a%%b+c) = %d%n", intOperation1, intOperation2, intOperation3, intOperation4);
	input.close();
	}
}