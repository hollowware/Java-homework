package homework;

public class Op017 {
	public static void main(String[] args) {
		int tableSize = 9;
		printTable(tableSize);
	}
	
	private static void printTable(int tableSize) { // write to file.  read from file. TODO
		System.out.format("      ");
		for ( int i = 1; i <= tableSize; i++ ) {
			System.out.format("%4d", i);
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		for (int i = 1; i <= tableSize; i++ ) {
			System.out.format("%4d |", i);
			for( int j = 1; j <= tableSize; j++ ) {
              System.out.format("%4d", i * j);
			}
			System.out.println();
		}
	}
}
