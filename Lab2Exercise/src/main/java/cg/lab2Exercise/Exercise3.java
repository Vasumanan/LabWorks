/**
*  Create a method which accepts an integer array.
*  reverse the numbers in the array and returns the resulting array in sorted order.
*  @author Vasumanan J
*  06/01/2021
*/
package cg.lab2Exercise;
import java.util.*;
public class Exercise3 {
	public static void main(String[] args) {
		int [] array = getInputArray();
		int length = array.length;
		array = getSorted(array);
		System.out.print("Sorted Array---> ");
		for(int index=0;index<length;index++) {
			System.out.print(array[index]+" ");
		}
	}
	static int[] getSorted(int[] array) {
		int length = array.length;
		for(int index=0;index<length;index++) {
			StringBuilder sb = new StringBuilder();
			sb.append(array[index]+"");
			sb.reverse();
			array[index]=Integer.parseInt(sb.toString());
		}
		Arrays.sort(array);
		return array;
	}
	private static int[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		int [] array = new int[size];
		System.out.println("Enter the numbers of the array");
		for(int index=0;index<size;index++) {
			array[index]=sc.nextInt();
		}
		return array;
	}

}

