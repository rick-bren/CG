import java.util.Scanner;

public class maximumNumberofHandshakes{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//Getting input from the user 
	    double numberOfStudents = scanner.nextDouble();
		//Calculating the maxinum number of handshakes done by N number of people
		double maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		//Displaying the result 
		System.out.println("The maximum number of possible handshakes : " + maximumHandshakes);
	scanner.close();
	}
}