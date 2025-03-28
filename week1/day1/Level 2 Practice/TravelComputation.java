import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Name:");
		String name = scanner.nextLine();
		System.out.println("Enter starting city");
		String fromCity = scanner.nextLine();
		System.out.println("Enter passing through city");
		String viaCity = scanner.nextLine();
		System.out.println("Enter destination city");
		String toCity = scanner.nextLine();
		System.out.println("Enter distance from starting city to passing city");
		double distanceFromToVia = scanner.nextDouble();
		System.out.println("Enter time taken from starting city to passing city");
		int timeFromToVia = scanner.nextInt();
		System.out.println("Enter distance from passing city to destination city");
		double distanceViaToFinalCity = scanner.nextDouble();
		System.out.println("Enter time taken from passing city to destination city");
		int timeViaToFinalCity = scanner.nextInt();
		double totalDistance = (double)distanceFromToVia + (double)distanceViaToFinalCity;
		int totalTime = (int)timeFromToVia + (int)timeViaToFinalCity;
		System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
	scanner.close();
						}
}