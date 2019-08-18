package op029_quadraticEquation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("a = ");
		double a = scan.nextDouble();
		System.out.print("b = ");
		double b = scan.nextDouble();
		System.out.print("c = ");
		double c = scan.nextDouble();
		
		QuadraticEquation qe = new QuadraticEquation(a, b, c);
		qe.calculation();
		
	}
}
