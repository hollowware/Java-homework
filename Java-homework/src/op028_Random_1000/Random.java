package op028_Random_1000;

import java.util.Arrays;

public class Random {

	int [] array = new int [50];
	int i;
	
	public void nextInt () {
		for ( i = 0; i < array.length; i++ ) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array));
	}
	
}
