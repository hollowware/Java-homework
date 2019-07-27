package op023_RectangleArea;

import java.util.Scanner;

public class Draft {
	Scanner scanner = new Scanner (System.in);
	int borderA;
	int borderB;
	
	public void readData () {
		System.out.println("Enter first rectangle border length: ");
		borderA = scanner.nextInt();
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
