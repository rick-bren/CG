import java.util.Scanner;

public class SalaryAndBonus{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//taking user inputs
		//inputting salary
		double salary = scanner.nextDouble();
		//inputting bonus
		double bonus = scanner.nextDouble();
		//Calculating total salary
		double totalSalary = salary + bonus;
		System.out.printf("The Salary is INR %.2f and Bonus is INR %.2f. Hence the Total Income is INR %.2f", salary, bonus, totalSalary);
	scanner.close();
	}
}