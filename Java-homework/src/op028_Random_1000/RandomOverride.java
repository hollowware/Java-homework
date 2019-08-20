package op028_Random_1000;

import java.util.Arrays;

public class RandomOverride extends Random {
	
	@Override
	public void nextInt () { 
		int [] array = new int [50];
		for ( i = 0; i < array.length; i++ ) {
			array[0] = 1000;
			array[i] = (int) (Math.random() * 100);
			
		}
		System.out.println(Arrays.toString(array));
	}
	
}
