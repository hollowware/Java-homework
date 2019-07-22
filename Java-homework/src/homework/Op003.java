package homework;

public class Op003 {
	public static void main(String[] args) {
		checkSquarePrimeter();
		checkSquarePrimete2();
		showSquareArea();
	}
	private static void checkSquarePrimeter() {
		System.out.println("--------------First Method----------------");
		int a = 5;
		int b = 5;
		int mySquarePerimeter = a + a + b + b;
		System.out.println("Square perimeter is " + mySquarePerimeter);
	}
	

	private static void checkSquarePrimete2() {
		System.out.println("--------------Second Method----------------");
		double borderLength = 13.3;
		double myPerimeter = borderLength * 4;
		System.out.println("Square perimeter is " + myPerimeter);
	}
	

	private static void showSquareArea() {
		System.out.println("--------------Square area Method----------------");
		double borderLength = 156.56;
		double mySquareArea = borderLength * borderLength;
		System.out.println("Square area is " + mySquareArea);
		System.out.format("Square area is %.2f%n", mySquareArea);
	}
}
