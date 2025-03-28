import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		//User input for Height
		System.out.println("Enter height:");
		double height = scanner.nextDouble();
		//User input for Base
		System.out.println("Enter base:");
		double base = scanner.nextDouble();
		//Calculating the area of the triangle
		double area = 0.5 * base * height;
		System.out.println("The Area of the Triangle whose Height = "+height+" and base = "+base+" is "+area+"cm.sq");
	scanner.close();
	}
}