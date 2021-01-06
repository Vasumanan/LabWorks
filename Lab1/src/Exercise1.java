/**
*  Create a method to find the sum of the cubes of the digits of an n digit number
*  @author Vasumanan J
*  4/01/2021
*/

import java.util.*;
public class Exercise1 {
	static int number ;
	public static void getNumber(Scanner sc) {
		System.out.println("Enter the number");
		number = sc.nextInt();
	}
	public static int findCube(int number) {
		int sumOfCube=0;
		while(number>0) {
			sumOfCube+=Math.pow(number%10,3);
			number/=10;
		}
		return sumOfCube;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getNumber(sc);
		System.out.println("Sum value = "+findCube(number));
	}
}
