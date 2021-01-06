/**
*  Write a Java program that displays the number of characters, lines and words in a text? 
*  @author Vasumanan J
*  6/01/2021
*/


import java.util.*;
import java.io.*;
public class Exercise5{ 
	static int wordCount = 0,lineCount=0;
	public static void main(String args[]) { 
		String str="";
		try {
			str = getInputString();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(str);
		System.out.println("Words Count----> "+wordCount);
		System.out.println("Character Count----> "+str.length());
		System.out.println("Line Count----> "+lineCount);
	}
	private static String getInputString() throws IOException  {
		String fileName = "C:\\Users\\Vasu\\Documents\\vasu.txt"; 
		Scanner sc = new Scanner(new FileInputStream(fileName));
		String str="",tempString="";
		while (sc.hasNextLine()) { 
			tempString=sc.nextLine(); 
			str+=tempString+" ";
			String[] words=tempString.split(" ");
			wordCount+=words.length;
			lineCount++;
		} 
		
		return str;
	}
}
