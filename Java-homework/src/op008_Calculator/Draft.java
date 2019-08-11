package op008_Calculator;

import java.util.Scanner;

public class Draft {
	
	private Scanner scan = new Scanner(System.in);
	private String operation;
	private String operator;
	private double a;
	private double b;
	private int c;
	private double result;
	private boolean boolResult;
	private int printBinResult;
	
	
	public void switchCalc() {
		System.out.println("Choose aritmetic, byte or logic operation. (Please type 'aritmetic', 'byte' or 'logic')");
		operation = scan.next();
		switch (operation) {
		case "aritmetic":
			aritmeticCalculator();      
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
		System.exit(1);
	}
	
	public void aritmeticCalculator() {
		try {
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
		} catch (Exception e) {
			System.out.println("Try again nerd.");
		}
		System.exit(1);
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
		}
		System.exit(1);
	}
	
	public void byteCalculator() {
		System.out.println("Hey man, enter number that you want to convert to binary: ");
		c = scan.nextInt();
		printBinary(c, 16);
		System.exit(1);
	}
	
	public void printBinary(int value, int size) {
		for (int i = size - 1; i >= 0; i--) {
			int mask = 1 << i;
			printBinResult = (mask & value) >> i;
			System.out.print(printBinResult); // how to print this answer normally?
		}
		
		System.out.println();
	}
	
}
