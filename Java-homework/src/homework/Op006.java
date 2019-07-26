package homework;

public class Op006 {
	public static void main(String[] args) {
		fahrenheitToCelsius();
	}
	private static void fahrenheitToCelsius() {
		double myFarenheit = 80;
		double newFarenheit = (myFarenheit - 32) * 0.55555555556;
		System.out.format(myFarenheit + " degrees of Farenheit equals " + newFarenheit + " degrees of Celsium"); 
	}
}
