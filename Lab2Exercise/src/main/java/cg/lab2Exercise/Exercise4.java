/**
*  Create a method which accepts an integer array and removes all the duplicates in the array. 
*  Return the resulting array in descending order
*  @author Vasumanan J
*  06/01/2021
*/
package cg.lab2Exercise;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		int []array=getInputArray();
		array = modifyArray(array); 
		int length = array.length;
		System.out.print("Modified Array----> ");
		for(int index=0;index<length;index++) {
			System.out.print(array[index]+" ");
		}

	}
	static int[] modifyArray(int[] array) {
		arraySort(array);
		int length = array.length;
		if(length==0) {
			return array;
		}
		int nextIndex = 0;
		int tempArray[]=new int[length];
        for (int currentIndex=0; currentIndex<length-1; currentIndex++){  
            if (array[currentIndex] != array[currentIndex+1]){  
                tempArray[nextIndex++] = array[currentIndex];  
            }  
        }  
        tempArray[nextIndex++] = array[length-1];  
        int modifiedArray[]=new int[nextIndex];
        for(int index=0;index<nextIndex;index++) {
        	modifiedArray[index]=tempArray[index];
        }
		return modifiedArray;
	}
	private static void arraySort(int[] array) {
		int temp=0;
		for (int index1 = 0; index1 < array.length; index1++) {   
            for (int index2 = index1+1; index2 < array.length; index2++) {   
               if(array[index1] < array[index2]) {  
                   temp = array[index1];  
                   array[index1] = array[index2];  
                   array[index2] = temp;  
               }   
            }   
        }  
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

