package op029_squareEquation;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		double a, b, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Example: (ax2 + bx + c = 0)");
		System.out.println();
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();

        Contract quadraticEquation = new Contract(a, b, c);
        quadraticEquation.Answer(a, b,quadraticEquation.Discriminant(a, b, c));

    }	
}
