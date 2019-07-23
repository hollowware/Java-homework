package homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Op010 {
	public static void main (String [] args) {
		letsPlayArray();
	}

	private static void letsPlayArray() {
		int [] myArray = new int[20];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int)(Math.random() * 1000);
		}
		System.out.println(Arrays.toString(myArray));
		////////////////
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		////////////////
		int arraySum = IntStream.of(myArray).sum(); // use for for sum
		System.out.println(arraySum);
	}
}
