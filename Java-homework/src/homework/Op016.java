package homework;


public class Op016 {
	public static void main (String[] args) {
	    printRange();
	}

	private static void printRange() {
		int EvenNumSum = 0;
		for (int i = 1; i <= 1000; i++ ) {
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
}		
		
		
	
	

