package op025_SortingMethods;

import java.util.Arrays;

public class ChooseSorting extends RandomArrGenerator {
	
	public void insertionSortArray () {
		RandomArrGenerator myRandomArray = new RandomArrGenerator();
		int [] arrayForSorting = myRandomArray.getMyArray();
		for (int i = 1; i < arrayForSorting.length; i++) {
			int key = arrayForSorting[i];
			int previousKey = i - 1;
			while ( previousKey >= 0 && arrayForSorting[previousKey] > key ) {
				arrayForSorting[previousKey + 1] = arrayForSorting[previousKey]; 
				previousKey = previousKey - 1;
			}
			arrayForSorting[previousKey + 1] = key;
		}
		System.out.println("Insertion sort: " + (Arrays.toString(arrayForSorting)));
	}
	
	public void simpleSortArray () {
		RandomArrGenerator myRandomArray = new RandomArrGenerator();
		int [] arrayForSorting = myRandomArray.getMyArray();
		Arrays.sort(arrayForSorting);
		System.out.println("Simple sort: " + (Arrays.toString(arrayForSorting)));
	}
	
}
