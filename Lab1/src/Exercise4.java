/**
*  Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
*  @author Vasumanan J
*  4/01/2021
*/

import java.util.*;
public class Exercise4 {
	static int number;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getNumber(sc);
		printPrimeNumber(number);
	}
	private static void printPrimeNumber(int number) {
		for(int index=0;index<number;index++) {
			if(checkPrime(index)) {
				System.out.print(index+" ");
			}
		}
	}

	private static boolean checkPrime(int number) {
		if(number==0 || number==1)
			return false;
		else {
			for(int index=2;index<=number/2;index++) {
				if(number%index==0)
					return false;
			}
			return true;
		}
	}

	private static void getNumber(Scanner sc) {
		System.out.println("Enter the number");
		number = sc.nextInt();
	}
}
