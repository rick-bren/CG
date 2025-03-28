import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();    
		if (n < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
		}
		int[] odd = new int[n/2+1];
		int[] even = new int[n/2+1];
		int evenIndex = 0;
        int oddIndex = 0;
		for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
			    even[evenIndex] = i;
                evenIndex++;
            } else {
			    odd[oddIndex] = i;
                oddIndex++;
            }
        }
		System.out.print("Even numbers: ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
