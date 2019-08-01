package op024_Calculator;

import java.util.Scanner;

public class Draft {
	
	private Scanner scanner = new Scanner (System.in);
	private double firstNum;
	private double secondNum;
	private double answer;
	private String symbol;
	
		public void chooseNumbers () {
		try {
		System.out.println("Enter first number: ");
		firstNum = scanner.nextDouble();
		System.out.println("Enter second number: ");
		secondNum = scanner.nextDouble(); 
		} catch (Exception e) {
			System.out.println("You're funny. Re-run the program.");
			System.exit(1);
		}
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
			if ( secondNum == 0 ) {
				System.out.println("Dividing by zero is impossible. Run program again.");
				System.exit(1);
			}
			answer = firstNum / secondNum;
			System.out.println("Answer is: " + answer);
			break;
			default:
				System.out.println("Bad choice.");
		}
	}
}
