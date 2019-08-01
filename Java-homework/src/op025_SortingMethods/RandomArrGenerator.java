package op025_SortingMethods;

import java.util.Arrays;

public class RandomArrGenerator {
	
	private int [] myArray = new int [100];

	public int [] generateArray () {
		for ( int i = 0; i < myArray.length; i++ ) {
			myArray[i] = (int) (Math.random() * 1000);
		}
		System.out.println(Arrays.toString(myArray));
		return myArray;
	}

	public int[] getMyArray() {
		return myArray;
	}
	
	
}
