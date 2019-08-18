package op025_SortingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Draft { // Split classes, TODO.

	Scanner scan = new Scanner(System.in);
	private int userArrayLength;
	
	public int userArrayLengthInput () {
		while (userArrayLength < 10 || userArrayLength > 100 ) {
		System.out.println("Hello, please enter array lenth of your choice between numbers 10 and 100: ");
		userArrayLength = scan.nextInt();
		}
		return userArrayLength;
	}
	
	int [] myArray = new int [userArrayLengthInput ()]; 
	
	public void generateArray () {
		for ( int i = 0; i < myArray.length; i++ ) {
			myArray[i] = (int) (Math.random() * 1000);
		}
		System.out.println(Arrays.toString(myArray));
	}
	
	public void userSortingChoice () {
		System.out.println("Now please choose which sorting method you prefer - insertion, bubble or fast.");
		String choosedSortingMethod = scan.next();
		switch (choosedSortingMethod) {
		case "insertion":
			insertionSortArray();
			break;
		case "bubble":
			bubbleSortArray();
			break;
		case "fast":
			simpleSortArray();
			break;
			default:
				System.out.println("Error, please re-run the program");
		}
	}
	
	public void insertionSortArray () {
		for (int i = 1; i < myArray.length; i++) {
			int key = myArray[i];
			int previousKey = i - 1;
			while ( previousKey >= 0 && myArray[previousKey] > key ) {
				myArray[previousKey + 1] = myArray[previousKey]; 
				previousKey = previousKey - 1;
			}
			myArray[previousKey + 1] = key;
		}
		System.out.println("Insertion sort: " + (Arrays.toString(myArray)));
	}
	
	public void bubbleSortArray () {
		for ( int i = myArray.length; i >= 0; i--) {
            for ( int j = 0; j < myArray.length - 1; j++) {
                int index = j + 1;
                if (myArray[j] > myArray[index]) {
                    int temp;
                    temp = myArray[j];
                    myArray[j] = myArray[index];
                    myArray[index] = temp;
                }
            }
        }
		System.out.println("Bubble sort: " + (Arrays.toString(myArray)));
	}
	
	public void simpleSortArray () {
		Arrays.sort(myArray);
		System.out.println("Simple sort: " + (Arrays.toString(myArray)));
	}
	
	
	
}
