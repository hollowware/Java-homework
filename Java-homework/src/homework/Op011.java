package homework;

import java.util.Arrays;

public class Op011 {
	public static void main (String [] args) {
		creatingBox();
	}

	private static void creatingBox() {
		int [][] myArray = new int [10][10];
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				myArray[i][j] = (i == j) ? 1:0;
			}
			System.out.println(Arrays.toString(myArray[i]));
		}
	}
}



