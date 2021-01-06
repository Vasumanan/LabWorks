/**
*  Create a method to check if a number is a power of two or not
*  @author Vasumanan J
*  4/01/2021
*/

import java.util.*;
public class Exercise8 {
	static int number=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		getInput(sc);
		if(checkNumber(number)) {
			System.out.println(number+" is power of 2");
		}
		else {
			System.out.println(number+" is not power of 2");
		}
		
	}

	private static boolean checkNumber(int number) {
		int powerValue=0,index=0;
		do {
			powerValue = (int)Math.pow(2,index);
			if(powerValue==number) {
				return true;
			}
			index++;
		}while(powerValue<number);
		return false;
	}

	private static void getInput(Scanner sc) {
		System.out.println("Enter the number");
		number = sc.nextInt();
		
	}
}
