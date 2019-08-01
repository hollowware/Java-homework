package homework;


public class Op016 {
	
	static int EvenNumSum = 0;
	static int i;
	static int from = 0;
	static int to = 1000;
	
	public static void main (String[] args) { 
//	    printRange();
//	    printWhile();
	    printDoWhile();
	}

	private static void printRange() {
		for ( i = 1; i <= 1000; i++ ) {
			if (i % 70 == 0) {
				System.out.println("");
			} 
			if (i % 2 == 0) {
				EvenNumSum += i;
				System.out.print(i + ", ");
			}
		}	
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println(EvenNumSum);
	}	
	
	private static void printWhile() {
		while (from <= to) {
			from++;
			if (from % 70 == 0) {
				System.out.println("");
			} 
			if (from % 2 == 0) {
				EvenNumSum += from;
				System.out.print(from + ", ");
			}
		}
		System.out.println();
		System.out.println(EvenNumSum);
	}

	private static void printDoWhile() {
		do {
			from++;
			if (from % 70 == 0) {
				System.out.println("");
			} 
			if (from % 2 == 0) {
				EvenNumSum += from;
				System.out.print(from + ", ");
			}
		} while (from <= to);
		System.out.println();
		System.out.println(EvenNumSum);
	}

}		
		
		
	
	

