/**
*  Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
*  @author Vasumanan J
*  4/01/2021
*/

import java.util.*;
public class Exercise5 {
	static int number;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getInput(sc);
		System.out.println("Sum of natural numbers divisible by 3 or 5 is "+ calculateSum(number));

	}
	private static int calculateSum(int number) {
		int sum=0;
		for(int index=1;index<=number;index++) {
			if(index%3==0 || index%5==0)
				sum+=index;
		}
		return sum;
	}
	private static void getInput(Scanner sc) {
		System.out.println("Enter the number");
		number = sc.nextInt();
		
	}
}
