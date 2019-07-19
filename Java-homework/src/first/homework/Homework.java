package first.homework;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		System.out.println("-----------------------SQUARE CALCULATIONS--------------------------");
		checkSquarePrimeter();
		checkSquarePrimete2();
		showSquareArea();
		printPi();
		yourWeightOnOtherPlanets();
		fahrenheitToCelsius();
		humanKMI();
//		simpleCalculator();
		getInput();
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
	

	private static void printPi() {
		System.out.println("--------------System prints PI with 5 numbers after dot----------------");
		double pi = Math.PI;
		System.out.println(pi);
		System.out.format("%.5f%n", pi);
	}
	
	private static void yourWeightOnOtherPlanets() {
		System.out.println("--------------System prints your weight on other planets----------------");
		double myWeightOnEarth = 96;
		double myWeightOnMercury = myWeightOnEarth * 0.38;
		double myWeightOnVenus = myWeightOnEarth * 0.91;
		double myWeightOnMars = myWeightOnEarth * 0.38;
		double myWeightOnJupiter = myWeightOnEarth * 2.34;
		double myWeightOnSaturn = myWeightOnEarth * 1.06;
		double myWeightOnUranus = myWeightOnEarth * 0.92;
		double myWeightOnNeptune = myWeightOnEarth * 1.19;
		double myWeightOnPluto = myWeightOnEarth * 0.06;
		System.out.format("Your weight on the Mercury is %.2f%n", myWeightOnMercury); // Can i add String after arg in Format method? // Error occur.
		System.out.format("Your weight on the Venus is %.2f%n", myWeightOnVenus);
		System.out.format("Your weight on the Mars is %.2f%n", myWeightOnMars);
		System.out.format("Your weight on the Jupiter is %.2f%n", myWeightOnJupiter);
		System.out.format("Your weight on the Saturn is %.2f%n", myWeightOnSaturn);
		System.out.format("Your weight on the Uranus is %.2f%n", myWeightOnUranus);
		System.out.format("Your weight on the Neptune is %.2f%n", myWeightOnNeptune);
		System.out.format("Your weight on the Pluto is %.2f%n", myWeightOnPluto);
	}

	private static void fahrenheitToCelsius() {
		System.out.println("--------------Method converts Farenheit to Celsius----------------");
		double myFarenheit = 80;
		double newFarenheit = (myFarenheit - 32) * 0.55555555556;
		System.out.format(myFarenheit + " degrees of Farenheit equals " + newFarenheit + " degrees of Celsium"); // Can i add String after arg in Format method? // Error occur.
	}

	private static void humanKMI() {
		System.out.println("--------------Method calculates your KMI----------------"); // what's wrong with this one, why he prints in-line???
		double myHeight = 1.87;
		double myWeight = 96;
		double yourKMI = myWeight / (myHeight * myHeight);
		System.out.format("%.2f%n", yourKMI);
	}
	
	private static void simpleCalculator() {
		System.out.println("--------------Calculator----------------");
		Scanner userNum = new Scanner(System.in);
		double firstNumber;
		double secondNumber;
		double answer;
		System.out.println("Enter first number: ");
		firstNumber = userNum.nextDouble();
		System.out.println("Enter second number: ");
		secondNumber = userNum.nextDouble();
		answer = firstNumber + secondNumber; // -; *; /;
		System.out.printf("Equals = %.2f%n", answer);
	}

	private static void getInput() {
		System.out.println("--------------getInput----------------");
		System.out.println("Enter your favourite week day: ");
		Scanner userInput = new Scanner(System.in);
		String weekDay = userInput.nextLine();
		System.out.println("Your favourite week day is - " + weekDay + ".");
	}
	
}
