package homework;

import java.util.Scanner;

public class Op023_Draft_rectangleArea {
	Scanner scanner = new Scanner (System.in);
	int borderA;
	int borderB;
	
	public void readFirstData () {
		System.out.println("Enter first rectangle border length: ");
		borderA = scanner.nextInt();
	}
	
	public void readSecondData () {
		System.out.println("Enter second rectangle border length: ");
		borderB = scanner.nextInt();
	}
	
	
	public int countSquareArea () {
		return borderA * borderB;
	}
	
	public void printData () {
		System.out.println("Rectangle area for the choosen border lengths is: " + countSquareArea());
	}
	
}
