package op023_RectangleArea;

import java.util.Scanner;

public class Draft {
	
	private int borderA;
	private int borderB;
	
	public void checkData() {
		if ( borderA < 0 || borderB < 0 ) {
			System.out.println("Only positive integers please. Re-run the program");
			System.exit(1);
		}
	}
	
	public void readData () {
		try (Scanner scanner = new Scanner (System.in)) {
		System.out.println("Enter first rectangle border length: ");
		borderA = scanner.nextInt();
		checkData();
		System.out.println("Enter second rectangle border length: ");
		borderB = scanner.nextInt();
		checkData();
		} catch (Exception e) {
			System.out.println("Only positive integers please. Re-run the program");
			System.exit(1);
		}
	}
	
	public int countSquareArea () {
		return borderA * borderB;
	}
	
	public void printData () {
		System.out.println("Rectangle area for the choosen border lengths is: " + countSquareArea());
	}

}
