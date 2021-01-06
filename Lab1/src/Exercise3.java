/**
*  The Fibonacci sequence is defined by the following rule. 
*  The first 2 values in the sequence are 1, 1. 
*  Every subsequent value is the sum of the 2 values preceding it. 
*  Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
*  @author Vasumanan J
*  4/01/2021
*/

import java.util.*;
public class Exercise3 {
	static int number;
	private static void getInput(Scanner sc) {
		System.out.println("Enter the Number");
		number=sc.nextInt();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int term1=0,term2=1;
        getInput(sc);
        System.out.println("Recursive Fuunction "+fibonnaciRecursive(number,term1,term2));
        System.out.print("Non Recursive Fuunction "+fibonnaciNonRecursive(number,term1,term2));
	}
	private static int fibonnaciRecursive(int number,int term1,int term2) {
		if(number==0) {
			return term1;
		}
		if(number==1) {
			return term2;
		}
		return fibonnaciRecursive(number-1,term2,term1+term2);
		
	}
	private static int fibonnaciNonRecursive(int number,int term1,int term2) {
		int term3 =0;
		if(number==0) {
			return term1;
		}
		else if(number==1) {
			return term2;
		}
		
		else {
			for(int index=2;index<=number;index++) {
				term3=term1+term2;
				term1=term2;
				term2=term3;
			}
			return term3;
		}
		
	}
		

}
