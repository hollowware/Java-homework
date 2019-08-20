package op025_SortingMethods;

import java.util.Arrays;

public class RandomArrGenerator extends UserScan {
	
	private int [] myArray = new int [new UserScan().userArrayLengthInput()];

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

	public void setMyArray(int[] myArray) {
		this.myArray = myArray;
	}
	
}
