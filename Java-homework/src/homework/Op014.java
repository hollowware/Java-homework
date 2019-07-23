package homework;

import java.util.Scanner;

public class Op014 {
	public static void main(String[] args) {
		int elements = 15; // bigInt
		int [] myArray = new int [elements];
		myArray[0] = 0;
		myArray[1] = 1;
		
		long start = System.currentTimeMillis();
		
		for (int i = 2; i < myArray.length; i++) {
			myArray[i] = myArray[i - 1] + myArray [i - 2];
		}
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}
}
