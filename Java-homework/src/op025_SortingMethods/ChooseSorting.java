package op025_SortingMethods;

import java.util.Arrays;

public class ChooseSorting {
	
	private int i;
	
	public void insertionSortArray (int [] arrayForSorting) {
		for ( i = 1; i < arrayForSorting.length; i++ ) {
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
	
	
	public void bubbleSortArray (int [] arrayForSorting) {
		for ( i = arrayForSorting.length; i >= 0; i--) {
            for ( int j = 0; j < arrayForSorting.length - 1; j++) {
                int index = j + 1;
                if (arrayForSorting[j] > arrayForSorting[index]) {
                    int temp;
                    temp = arrayForSorting[j];
                    arrayForSorting[j] = arrayForSorting[index];
                    arrayForSorting[index] = temp;
                }
            }
        }
		System.out.println("Bubble sort: " + (Arrays.toString(arrayForSorting)));
	}
	
	public void simpleSortArray (int [] arrayForSorting) {
		Arrays.sort(arrayForSorting);
		System.out.println("Simple sort: " + (Arrays.toString(arrayForSorting)));
	}
	
}
