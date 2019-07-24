package homework;

public class Op022 {
	public static void main (String[] args) {
		String [] array = {"Tree", "Abrakadabrababa", "Car", "Fridge", "Table", "Fork", "Object", "Pi", "Chair", "Board", "WindowsHome"};
		findLongestStringElement(array);
	}

	private static void findLongestStringElement(String[] array) {
		int index = 0; 
		int elementLength = array[0].length();
		for (int i = 0; i < array.length; i++ ) {        
			if ( array[i].length() > elementLength ) {
				index = i; 
				elementLength = array[i].length();
			}
		}
		System.out.println("Longest string element is: " + array[index]);
	}
}
