package homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Op010 {
	
	static int [] myArray = new int[20];
	static int i;
	static int arraySum;
	
	public static void main (String [] args) {
		letsPlayArray();
	}
	
	private static void letsPlayArray() {
		for ( i = 0; i < myArray.length; i++)  {
			myArray[i] = (int)(Math.random() * 1000);
		}
		System.out.println(Arrays.toString(myArray));
		
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		
		for (int i = 0; i < myArray.length; i++) {
			arraySum = arraySum + myArray[i]; 
		}
		System.out.println(arraySum);
	}
}
