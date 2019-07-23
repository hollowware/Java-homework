package homework;

public class Op008 {
	public static void main(String[] args) {
		aritmeticCalculator();
		logicCalculator();
		byteCalculator();
	}
	////////////////////////////
	private static void aritmeticCalculator() {
		System.out.println("--------------Aritmetic-Calculator----------------");
		double a = 23;
		double b = 42;
		System.out.println("--------------Sum----------------");
		System.out.println(a + b);
		System.out.println("--------------Minus----------------");
		System.out.println(a - b);
		System.out.println("--------------Multiple----------------");
		System.out.println(a * b);
		System.out.println("--------------Divide----------------");
		System.out.println(a / b);
	}
	//////////////////////////
	private static void logicCalculator() {
		System.out.println("--------------Logic-Calculator----------------");
		int a = 15;
		int b = 37;
		boolean result = (a == b);
		System.out.println(result);
		boolean result2 = (a != b);
		System.out.println(result2);
		boolean result3 = (a > b);
		System.out.println(result3);
		boolean result4 = (a < b);
		System.out.println(result4);
	}
	///////////////////////////////////////
	private static void printBinary(int value, int size) { // float and double can't be printed in Binary code. 
		for (int i = size - 1; i >= 0; i--) {
			int mask = 1 << i;
			int result = (mask & value) >> i;
			System.out.print(result);
		}
		System.out.println();
	}
	private static void byteCalculator() {
		System.out.println("--------------Binary-Calculator----------------"); // SWITCH
		int a = 15;
		printBinary(a, 16);
		int b = 3;
		printBinary(b, 16);
		System.out.println("--------------Binary-Sum----------------");
		int result = a + b;
		printBinary(result, 16);
		System.out.println("Result Int: " + result);
		System.out.println("--------------Binary-Minus----------------");
		int result1 = a - b;
		printBinary(result1, 16);
		System.out.println("Result Int: " + result1);
		System.out.println("--------------Binary-Multiple----------------");
		int result2 = a * b;
		printBinary(result2, 16);
		System.out.println("Result Int: " + result2);
		System.out.println("--------------Binary-Divide----------------");
		int result3 = a / b;
		printBinary(result3, 16);
		System.out.println("Result Int: " + result3);
	}
	
}

