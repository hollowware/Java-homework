package homework;

import java.util.Arrays;

public class Op021 {  // TODO
	public static void main (String[] args) {
		int [] random = new int [15];
		generateRandomArray(random);
		findDuplicates(random);
	}

	private static void generateRandomArray(int[] random) {
		for ( int i = 0; i < random.length; i++ ) {
			random[i] = (int) ( Math.random() * 100 );
		}
		System.out.println(Arrays.toString(random));
	}

	private static void findDuplicates(int[] random) {
		int noDuplicateArr = random.length; 
		int size = random.length;
		for ( int j = 0; j < size; j++ ) {
			for ( int k = j + 1; k < size; k++ ) {
				if ( random[j] == random[k] ) {
					System.out.println(random[k] + ", ");
					random[k] = random[size - 1]; // replace duplicate with last unique element.
					size--;
					k--;
					noDuplicateArr--;  
				}
			}
		}
		int[] arrayWithoutDuplicates = Arrays.copyOf(random, noDuplicateArr); // Creating a copy of the original array
		System.out.println("Array Without Duplicates : ");
		for (int i = 0; i < arrayWithoutDuplicates.length; i++){
	             System.out.print(arrayWithoutDuplicates[i] + " ");
		}
	}
}

	
