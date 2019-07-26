package Op008_Calculator;

import java.util.Scanner;

public class Draft {
	Scanner scan = new Scanner(System.in);
	String operation;
	String operator;
	double a;
	double b;
	int c;
	double result;
	boolean boolResult;
	int printBinResult;
	
	
	public void switchCalc() {
		System.out.println("Rule nr. 1 - Choose aritmetic, byte or logic operation. (Please type 'aritmetic', 'byte' or 'logic')");
		operation = scan.next();
		switch (operation) {
		case "aritmetic":
			aritmeticCalculator();       // When executed method automatically runs second method, why? (all methods same problem)
			break;
		case "byte":
			byteCalculator();
			break;
		case "logic":
			logicCalculator();
			break;
			default: 
				System.out.println("No no, watch rule nr. 1");
		}
		return;
	}
	
	public void aritmeticCalculator() {
		System.out.println("Hey man, enter first number: ");
		a = scan.nextDouble();
		System.out.println("Hey man, enter second number: ");
		b = scan.nextDouble();
		System.out.println("Hey man, enter operator. Choose from - (+, -, *, /, %) ");
		operator = scan.next();
		switch (operator) {
		case "+":
			result = a + b;
			System.out.println("Result is: " + result);
			break;
		case "-":
			result = a - b;
			System.out.println("Result is: " + result);
			break;
		case "*":
			result = a * b;
			System.out.println("Result is: " + result);
			break;
		case "/":
			result = a / b;
			System.out.println("Result is: " + result);
			break;
		case "%":
			result = a % b;
			System.out.println("Reminder is: " + result);
			break;
			default:
				System.out.println("Try again nerd.");
		}
		return;
	}
	
	public void logicCalculator() {
		System.out.println("Hey man, enter first number: ");
		a = scan.nextDouble();
		System.out.println("Hey man, enter second number: ");
		b = scan.nextDouble();
		System.out.println("Hey man, enter operator. Choose from - (<, >, =) ");
		operator = scan.next();
		switch (operator) {
		case "<":
			boolResult = a < b;
			System.out.println("Result is: " + boolResult);
			break;
		case ">":
			boolResult = a > b;
			System.out.println("Result is: " + boolResult);
			break;
		case "=":
			boolResult = a == b;
			System.out.println("Result is: " + boolResult);
			break;
			default:
				System.out.println("Try again nerd.");
				return;
		}
	}
	
	public void byteCalculator() {
		System.out.println("Hey man, enter number that you want to convert to binary: ");
		c = scan.nextInt();
		printBinary(c, 16);
		return;
	}
	
	public void printBinary(int value, int size) {
		for (int i = size - 1; i >= 0; i--) {
			int mask = 1 << i;
			printBinResult = (mask & value) >> i;
			System.out.print(printBinResult); // how to print this answer normally?
		}
		
		System.out.println();
		return;
	}
	
}
