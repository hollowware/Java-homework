package homework;

import java.util.Arrays;

public class Op011 {
	public static void main (String [] args) {
		creatingBox();
	}

	private static void creatingBox() {
		int [] myArray = new int [10];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = 1;
			System.out.println(Arrays.toString(myArray));
		}
	}
}


