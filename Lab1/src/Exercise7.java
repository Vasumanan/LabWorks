/**
*  Create a method to check if a number is an increasing number
*  @author Vasumanan J
*  4/01/2021
*/
import java.util.*;
public class Exercise7 {
	static int number=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getInput(sc);
		if(checkNumber(number)) {
			System.out.println(number+" is an increasing number");
		}
		else {
			System.out.println(number+" is not an increasing number");
		}

	}
	private static boolean checkNumber(int number) {
		int currentDigit=0,previousDigit=Integer.MAX_VALUE;
		while (number>0) {
			currentDigit= number%10;
			if(previousDigit<currentDigit) {
				return false;
			}
			number/=10;
			previousDigit=currentDigit;
		}
		return true;
	}
	private static void getInput(Scanner sc) {
		System.out.println("Enter the number");
		number=sc.nextInt();
	}
}
