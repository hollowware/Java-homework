package homework;

public class Op006 {
	public static void main(String[] args) {
		fahrenheitToCelsius();
	}
	private static void fahrenheitToCelsius() {
		System.out.println("--------------Method converts Farenheit to Celsius----------------");
		double myFarenheit = 80;
		double newFarenheit = (myFarenheit - 32) * 0.55555555556;
		System.out.format(myFarenheit + " degrees of Farenheit equals " + newFarenheit + " degrees of Celsium"); // Can i add String after arg in Format method? // Error occur.
	}

}
