package op025_SortingMethods;

import java.util.Arrays;

public class RandomArrGenerator {
	
	private int userChoice;
	private int [] myArray = new int [userChoice];

	public int [] generateArray () {
		for ( int i = 0; i < myArray.length; i++ ) {
			myArray[i] = (int) (Math.random() * 1000);
		}
		System.out.println(Arrays.toString(myArray));
		return myArray;
	}
	
	public void setMyArray(int[] userChoice) {
		this.myArray = userChoice;
	}

	
}
