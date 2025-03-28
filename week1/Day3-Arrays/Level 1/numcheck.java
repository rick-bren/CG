import java.util.Scanner;

public class numcheck {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int[] num = new int[5];
		for (int i=0; i<5; i++) {
		    num[i] = input.nextInt();
		}
		for (int i=0; i<num.length; i++) {
		    if (num[i]>0) {
			    if (num[i]%2==0) {
					System.out.println(num[i]+" is positive and even.");
				} else {
					System.out.println(num[i]+" is positive and odd.");
				}
			} else if (num[i]<0) {
			    System.out.println(num[i]+" is negative.");
			} else {
			    System.out.println(num[i]+" is zero.");
			}
		}
		int first = num[0];
		int last = num[num.length - 1];
		if (first == last) {
		    System.out.println("The first and alst elements are equal");
		} else if (first>last) {
		    System.out.println("The first element is greater than last element");
		} else {
		    System.out.println("The last element is greater than first element");
		}
		input.close();
	}
}