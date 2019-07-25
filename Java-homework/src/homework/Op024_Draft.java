package homework;

import java.util.Scanner;

public class Op024_Draft {
	int firstNum;
	int secondNum;
	int answer;
	String symbol;
	
	public void chooseNumbers () {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter first number: ");
		firstNum = scanner.nextInt();
		System.out.println("Enter second number: ");
		secondNum = scanner.nextInt();
	}
	
	public void chooseOperation () {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Choose operation from the given - ' +, -, * , / ': ");
		symbol = scanner.next(); // scanner don't read input. TODO
		if (symbol == "+") {
			answer = firstNum + secondNum;
		} else if (symbol == "-") {
			answer = firstNum - secondNum;
		} else if (symbol == "*") {
			answer = firstNum - secondNum;
		} else if (symbol == "/") {
			answer = firstNum - secondNum;
		} else if (symbol == "%") {
			answer = firstNum - secondNum;
		} else {
			System.out.println("Wrong operator choosed.");
		}
	}
	
	public void printAnswer() {
		System.out.println("Your " + symbol + " operation answer is: " + answer);
		System.out.println("Your " + symbol + " operation answer is: " + answer);
		System.out.println("Your " + symbol + " operation answer is: " + answer);
		System.out.println("Your " + symbol + " operation answer is: " + answer);
		System.out.println("Your " + symbol + " operation answer is: " + answer);
	}
}
