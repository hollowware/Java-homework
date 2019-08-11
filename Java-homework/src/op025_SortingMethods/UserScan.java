package op025_SortingMethods;

import java.util.Scanner;

public class UserScan extends ChooseSorting { // shoots stackOverFlow because of extending. TODO
	
	private int userArrayLength;
	private String choosedSortingMethod;

	public int userInput () {
		try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Hello, please enter array lenth of your choice between numbers 10 and 100: ");
		userArrayLength = scan.nextInt();
		if (userArrayLength < 10 || userArrayLength > 100 ) {
			System.out.println("Error, please re-run the program");
			System.exit(1);
		}
		System.out.println("Now please choose which sorting method you prefer - insertion, bubble or fast.");
		choosedSortingMethod = scan.next();
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
		} catch (Exception e) {
			System.out.println("Error, please re-run the program");
			System.exit(1);
		}
		return userArrayLength;
	}

	public int getUserArrayLength() {
		return userArrayLength;
	}

	public void setUserArrayLength(int userArrayLength) {
		this.userArrayLength = userArrayLength;
	}
	
	
}
