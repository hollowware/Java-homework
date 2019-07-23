package homework;

import java.util.Arrays;

public class Opa019 {
	public static void main(String[] args) {
		int i;
		int [] firstArray = new int [10];
		int [] secondArray = new int [10];
		int [] sumArray = new int [10];
		for ( i = 0; i < firstArray.length; i++ ) {
			firstArray[i] = (int) (Math.random() * 1000);
		}
		System.out.print("First Array - ");
		System.out.println(Arrays.toString(firstArray));
		System.out.println("----------------------------------------------------------------------------");
		for ( i = 0; i < secondArray.length; i++ ) {
			secondArray[i] = (int) (Math.random() * 1000);
		}
		System.out.print("Second Array - ");
		System.out.println(Arrays.toString(secondArray)); 
		System.out.println("----------------------------------------------------------------------------");
		for ( i = 0; i < sumArray.length; i++ ) {
			sumArray[i] = firstArray[i] + secondArray[i];
		}
		System.out.print("Both Array's sum - ");
		System.out.println(Arrays.toString(sumArray));
 	}
}
