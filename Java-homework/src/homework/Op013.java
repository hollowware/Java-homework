package homework;

public class Op013 {
	public static void main (String [] args) {
		factorial();
	}

	private static void factorial() {
		int factorial = 1;
		int number = 10;
		for(int i = 1; i <= number; i++){    
			factorial = factorial * i;   // padirbeti
//			1 = 1 * 1 (1)
//			1 = 1 * 2 (2)
//			2 = 2 * 3 (6)
//			6 = 6 * 4 (24)
//			24 = 24 * 5 (120) 
		}
		System.out.println("Factorial of " + number + " is: " + factorial); 
	}
	
}
