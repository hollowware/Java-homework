package op024_Calculator;

import java.util.Scanner;

public class Draft {
	Scanner scanner = new Scanner (System.in);
	int firstNum;
	int secondNum;
	int answer;
	String symbol;
	
	public void chooseNumbers () {
		System.out.println("Enter first number: ");
		firstNum = scanner.nextInt();
		System.out.println("Enter second number: ");
		secondNum = scanner.nextInt(); 
	}
	
	public void chooseOperation () {
		System.out.println("Choose operation from the given - ' +, -, * , / ': ");
		symbol = scanner.next();
		switch (symbol) {
		case "+":
			answer = firstNum + secondNum;
			System.out.println("Answer is: " + answer);
			break;
		case "-":
			answer = firstNum - secondNum;
			System.out.println("Answer is: " + answer);
			break;
		case "*":
			answer = firstNum * secondNum;
			System.out.println("Answer is: " + answer);
			break;
		case "/":
			answer = firstNum / secondNum;
			System.out.println("Answer is: " + answer);
			break;
			default:
				System.out.println("Bad choice.");
		}
	}
}
