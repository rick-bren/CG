import java.util.Scanner;
public class Perimeter{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the side of the Square: ");
		double side = scanner.nextDouble();
		double perimeter = 4 * side ;
		System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter);
	scanner.close();	
	}
}