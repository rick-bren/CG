import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter a no.");
		int num = input.nextInt();
		for (int i=1;i<=num;i++) {
			boolean isdivsible = (i%3==0) && (i%5==0);
			if (isdivsible) {
			    System.out.println("FizzBuzz");
			}
		    
			else if (i%5==0){
			    System.out.println("Buzz");
			}
			else if (i%3==0) {
				System.out.println("Fizz");
			
			} else {
				System.out.println(i);
			}
		}
	}
}