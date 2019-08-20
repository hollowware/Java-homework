package op035_Music_Box;

import java.util.Scanner;

public class ChooseSong {

    public static Scanner scan = new Scanner(System.in);
    
	public static String getStringInputValue() {
		System.out.println("Choose a song from a list: ");
        String input = scan.nextLine().replaceAll("\\s+","").toLowerCase();
        System.out.println();
        System.out.println("Playing.. Tlalal.Tralalala..lalala..");
        System.out.println();
        return input;
    }
	
}
