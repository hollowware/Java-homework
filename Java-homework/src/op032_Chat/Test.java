package op032_Chat;

import java.io.*;
import java.util.Scanner;

public class Test {
	public static void main(String args[]){

        System.out.print("Enter Text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
          fWriter = new FileWriter("text.txt");
          writer = new BufferedWriter(fWriter);
          writer.write(text);
          writer.newLine();
          writer.close();
          System.err.println("Your input of " + text.length() + " characters was saved.");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
