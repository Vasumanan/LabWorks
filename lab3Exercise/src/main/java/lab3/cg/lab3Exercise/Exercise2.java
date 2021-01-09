package lab3.cg.lab3Exercise;
/**
*  Create a class containing a method to create the mirror image of a String. 
*  The method should return the two Strings separated with a pipe(|) symbol .
*  @author Vasumanan J
*  6/01/2021
*/

import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		String str = getInputString();
		System.out.println("Mirror image of the string----> "+getImage(str));	
	}

	public static String getImage(String str) {
		if(str.length()==0) {
			return "Given an Empty String";
		}
		StringBuilder sb = new StringBuilder(str);
		str+="|"+sb.reverse();
		return str;
	}

	private static String getInputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		return str;
	}

}
