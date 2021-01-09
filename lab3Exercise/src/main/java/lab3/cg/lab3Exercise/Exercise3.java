package lab3.cg.lab3Exercise;
/**
*  Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
*  Note: Consonant refers to all alphabets excluding vowels
*  @author Vasumanan J
*  6/01/2021
*/

import java.util.*;
public class Exercise3 {
	public static void main(String[] args) {
		String str = getInputString();
		try {			
			System.out.println("Altered string----> "+alterString(str));	
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	public static String alterString(String str) {
		int length = str.length();
		if(length==0) {
			return ("Given an Empty String");
		}
		else if(str.matches("[a-zA-Z ]+")) {
			String vowels ="aeiouAEIOU";
			String str1="";
			char[]stringArray = str.toCharArray();
			for(int index=0;index<length;index++) {
				if((vowels.contains(stringArray[index]+""))|| stringArray[index]==' ') {
					str1+=stringArray[index]+"";
				}
				else {
					char ch =stringArray[index];
					if(ch=='z') {
						ch='a';
					}
					else if(ch=='Z') {
						ch='A';
					}
					else {
						ch++;
					}
					str1+=ch+"";
				}
			}
			return str1;
		}
		else {
			throw new RuntimeException("String Should contain Alphabets only");
		}
	}
	private static String getInputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		return str;
	}

}
