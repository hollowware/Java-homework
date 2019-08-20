package op025_SortingMethods;

public class Main {
	public static void main (String[] args) {
		
//		Draft draft = new Draft();
//		draft.userArrayLengthInput();
//		draft.generateArray(); 
//		draft.userSortingChoice();
		
		UserScan user = new UserScan();
		user.userArrayLengthInput();
		user.userSortingChoice();
		RandomArrGenerator array = new RandomArrGenerator();
		System.out.println(array.getMyArray());

	
	}	
}
