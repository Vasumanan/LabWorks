/**
*  Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?
*  @author Vasumanan J
*  6/01/2021
*/
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		String str = getInputString();
		System.out.println("Sum Of Integers----> "+findSum(str));
	}
	private static int findSum(String str1) {
		String []str2=str1.split(" ");
		int length = str2.length;
		int sum=0;
		for(int index=0;index<length;index++) {
			sum+=Integer.parseInt(str2[index]);
		}
		return sum;
	}
	private static String getInputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		return str;
	}

}
