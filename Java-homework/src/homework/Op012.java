package homework;

import java.util.Scanner;

public class Op012 {
	
		public static Scanner myScanner = new Scanner(System.in);
		public static int squareArea;
		public static int rectangleArea;
		public static int Scan;
		public static int a, b, c;
		public static double circleArea;
		public static double Scan2;
		public static double r;
		
	public static void main (String [] args) {
		System.out.println("Enter number for calculating square area: ");
		Scan = myScanner.nextInt();
		a = Scan;
		System.out.println("Enter number for calculating circle area: ");
		Scan2 = myScanner.nextInt();
		r = Scan2;
		System.out.println("Enter first border length for calculating rectangle area: ");
		b = myScanner.nextInt();
		System.out.println("Enter second border length for calculating rectangle area: ");
		c = myScanner.nextInt();
		squareArea(a);
		circleArea(r);
		rectangleArea(b, c);
	}

	private static void squareArea(int a) {
		squareArea = a * a;
		System.out.println("Square area is: " + squareArea);
	}

	private static void circleArea(double r) {
		circleArea = (r * r) * Math.PI;
		System.out.println("Circle area is: " + circleArea);
	}

	private static void rectangleArea(int b, int c) {
		rectangleArea = b * c;
		System.out.println("Rectangle area is: " + rectangleArea);
	}

}
