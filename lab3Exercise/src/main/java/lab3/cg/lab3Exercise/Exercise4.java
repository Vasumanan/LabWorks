package lab3.cg.lab3Exercise;
/**
*  Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
*  The digit in the units place can be left as it is.
*  Note: Take the absolute value of the difference. Ex: 6-8 = 2
*  @author Vasumanan J
*  6/01/2021
*/


import java.util.*;
public class Exercise4 {
	public static void main(String[] args) {
		int number = getInputNumber();
		try {			
			System.out.println("Modified Number ----> "+modifyNumber(number));	
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	public static int modifyNumber(int number) {
		if(number<0) {
			throw new RuntimeException("Enter the Positive Number");
		}
		else {
			String str =Integer.toString(number);
			StringBuffer  modifiedString = new StringBuffer();
			int length = str.length(),modifiedNumber=0;
			for(int index=0;index<length-1;index++) {
				 modifiedString.append(Math.abs(Character.getNumericValue(str.charAt(index+1))-Character.getNumericValue(str.charAt(index))));
			}
			modifiedString.append(str.charAt(length-1));
			modifiedNumber=Integer.parseInt(modifiedString.toString());
			return modifiedNumber;
		}
	}
	private static int getInputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = sc.nextInt();
		return number;
	}


}
