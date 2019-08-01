package op025_SortingMethods;

import java.util.Arrays;

public class Draft {
	int [] myArray = new int [10000]; // TODO oop, one object generate random array, other choosable sorting. 
	
	public void generateArray () {
		for ( int i = 0; i < myArray.length; i++ ) {
			myArray[i] = (int) (Math.random() * 1000);
		}
		System.out.println(Arrays.toString(myArray));
	}
	
	public void sortArray () {
		Arrays.sort(myArray);
		System.out.println("1 - " + (Arrays.toString(myArray)));
	}
	
	public void insertionSortArray () {
		for (int i = 1; i < myArray.length; i++) {
			int key = myArray[i];
			int previousKey = i - 1;
			while ( previousKey >= 0 && myArray[previousKey] > key ) {
				myArray[previousKey + 1] = myArray[previousKey]; 
				previousKey = previousKey - 1;
			}
			myArray[previousKey + 1] = key;
		}
		System.out.println("2 - " + (Arrays.toString(myArray)));
	}
	
	public void quickSortArray () { // TODO
		
	}
	
	
	
}
