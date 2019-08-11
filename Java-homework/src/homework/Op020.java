package homework;

import java.util.Arrays;

public class Op020 {
	public static void main (String[] args) {
		String[] myArray = {"Deer", "Cut", "Dog", "Cat", "Son", "Snake", "Bug", "Sun", "Cloud"};
		sortStringArray(myArray);
		fastSortStringArray(myArray);
	}

	private static void sortStringArray(String[] myArray) {
		for (int i = 0; i < myArray.length - 1; i++ ) {        // iterate through all array elements
			for ( int j = i + 1; j < myArray.length; j++ ) {   // iterate again taking next element i + 1. 
				if(myArray[i].compareTo(myArray[j])>0) {       // compare pairs of words lexicographically. If String-1 > String-2, it returns positive number  
		               String temp = myArray[i];             // Swapping words.
		               myArray[i] = myArray[j];
		               myArray[j] = temp;
		        }
			}
		}
		System.out.println(Arrays.toString(myArray));
	}
	
	private static void fastSortStringArray(String[] myArray) {
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
	}
}
