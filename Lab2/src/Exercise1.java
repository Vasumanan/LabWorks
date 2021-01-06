/**
*  Create a method which accepts an array of integer elements and return the second smallest element in the array
*  @author Vasumanan J
*  5/01/2021
*/

import java.util.*;
public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]array=getInputArray(sc);
		System.out.println("Second smallest number in array --->"+getSecondSmallest(array));

	}

	private static int getSecondSmallest(int[] array) {
		Arrays.sort(array);
		
		return array[1];
	}

	private static int[] getInputArray(Scanner sc) {
		int size=0;
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int[]array = new int[size];
		System.out.println("Enter the elements of array");
		for(int index=0;index<size;index++) {
			array[index]=sc.nextInt();
		}
		return array;
		
	}

}
