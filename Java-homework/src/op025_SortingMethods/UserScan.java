package op025_SortingMethods;

import java.util.Scanner;

public class UserScan extends ChooseSorting {
	
	private static Scanner scan = new Scanner(System.in);
	private static int userArrayLength;
	
	public int userArrayLengthInput () {
		while (userArrayLength < 10 || userArrayLength > 100 ) {
		System.out.println("Hello, please enter array lenth of your choice between numbers 10 and 100: ");
		userArrayLength = scan.nextInt();
		}
		return userArrayLength;
	}
	
	public void userSortingChoice () {
		System.out.println("Now please choose which sorting method you prefer - insertion, bubble or fast.");
		String choosedSortingMethod = scan.next();
		switch (choosedSortingMethod) {
		case "insertion":
			insertionSortArray(new RandomArrGenerator().getMyArray());
			break;
		case "bubble":
			bubbleSortArray(new RandomArrGenerator().getMyArray());
			break;
		case "fast":
			simpleSortArray(new RandomArrGenerator().getMyArray());
			break;
			default:
				System.out.println("Error, please re-run the program");
		}
	}
	
	
}
