package homework;

public class Op022 {
	public static void main (String[] args) {
		String [] array = {"Tree", "Abrakadabrababa", "Car", "Fridge", "Table", "Fork", "Object", "Pi", "Chair", "Board", "WindowsHome"};
		findLongestStringElement(array);
	}

	private static void findLongestStringElement(String[] array) {
		int index = 0; 
		int firstElementLength = array[index].length();
		for (int i = 0; i < array.length; i++ ) {        
			if ( array[i].length() > firstElementLength ) {
				index = i; 
				firstElementLength = array[i].length();
			}
		}
		System.out.println("Longest string element is: " + array[index]);
	}
}
