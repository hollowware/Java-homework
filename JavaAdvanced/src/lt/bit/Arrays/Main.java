package lt.bit.Arrays;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		int [] myArray = new int [10];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 100);
		}
		
		int [] tempArray = new int [myArray.length];
		int repeat = 0;
		
		System.out.println(Arrays.toString(myArray));
		System.out.println("**********************************");
		
		while (repeat < myArray.length) {
			for (int i = 0; i < myArray.length; i++) {
				if (i == 0) {
					tempArray[i] = myArray[myArray.length - 1];
				} else {
					tempArray[i] = myArray[i - 1];
				}
			}
			for (int i = 0; i < tempArray.length; i++) {
				myArray[i] = tempArray[i];
			}
			System.out.println(Arrays.toString(tempArray));
			repeat++;
		}
		
//		int [] in = {1,2,3,4};
//		int [][] out = new int [in.length][in.length];
//		for (int i = 0; i < in.length; i++) {
//			for (int j = 0; j < in.length; j++) {
////				out[i][j] = in[(j + i)% in.length];
//				out[i][(j+i) % in.length] = in[j];
//			}
//		}
//		System.out.println(Arrays.deepToString(out));
	
	}
}
