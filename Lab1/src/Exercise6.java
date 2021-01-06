/**
*  Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
*  @author Vasumanan J
*  4/01/2021
*/


import java.util.*;
public class Exercise6 {
	static int number;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getInput(sc);
		System.out.println("Difference between sum of squares and square of sum is "+ calculateDifference(number));

	}
	private static int calculateDifference(int number) {
		int sumOfSquares=0,squareOfSum=0,difference=0,sum=0;
		for(int index=1;index<=number;index++) {
			sumOfSquares+=Math.pow(index,2);
			sum+=index;
		}
		squareOfSum = (int) Math.pow(sum,2);
		difference = sumOfSquares-squareOfSum;
		return difference;
	}
	private static void getInput(Scanner sc) {
		System.out.println("Enter the number");
		number = sc.nextInt();
		
	}
}
