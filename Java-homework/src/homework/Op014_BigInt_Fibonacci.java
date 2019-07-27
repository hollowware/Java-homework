package homework;

import java.math.BigInteger;
import java.util.Scanner;

public class Op014_BigInt_Fibonacci {
	public static void main (String[] args) { 
		Scanner scan = new Scanner (System.in);
		System.out.println("How many numbers you want to print in Fibonacci sequence?");
		int sequenceLength = scan.nextInt();
		BigInteger[] bigIntArray = new BigInteger[sequenceLength]; 
		bigIntArray[0] = BigInteger.ZERO;
		bigIntArray[1] = BigInteger.ONE;
		
		for (int i = 2; i < bigIntArray.length; i++) {
			bigIntArray[i] = bigIntArray[i-1].add(bigIntArray[i-2]);
		}
		for (int i = 0; i < bigIntArray.length; i++) {
			System.out.print(bigIntArray[i] + " ");
		}	
	}
}
