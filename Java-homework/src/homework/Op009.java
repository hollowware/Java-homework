package homework;

import java.util.Scanner;

public class Op009 {
	public static void main(String[] args) {
//		op003Scanner();
		op008Scanner();
	}

	private static void op003Scanner() {
		System.out.println("--------------Square Perimeter----------------"); // enter scanner separate
		Scanner myBorderLength = new Scanner(System.in); 
		double borderLenght;
		double perimeter;
		System.out.println("Enter square border length baby: ");
	    borderLenght = myBorderLength.nextDouble();
	    perimeter = borderLenght * 4;
	    System.out.println("Okay, perimeter is: " + perimeter);
	}

	private static void op008Scanner() {
		System.out.println("--------------Square Area----------------");
		Scanner myBorderLength = new Scanner(System.in); 
		double borderLenght;
		double SquareArea;
		System.out.println("Enter square border length baby: ");
	    borderLenght = myBorderLength.nextDouble();
	    SquareArea = borderLenght * borderLenght;
	    System.out.println("Okay, square area is: " + SquareArea);
	}
}
