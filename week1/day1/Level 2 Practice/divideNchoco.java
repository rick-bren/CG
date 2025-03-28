import java.util.Scanner;

public class divideNchoco {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("No.of Chocolates");
		double numberOfchocolates = scanner.nextDouble();
		System.out.println("No.of Childeren");
		double numberOfchildren = scanner.nextDouble();
		int eachgets = (int) numberOfchocolates / (int) numberOfchildren;
		double remaining = numberOfchocolates % numberOfchildren;
		System.out.println("The number of chocolates each child gets is "+eachgets+" and the number of remaining chocolates are "+remaining);
	scanner.close();
	}
}