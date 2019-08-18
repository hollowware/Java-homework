package op033_SearchKeyWordsInTXT;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CreateNewFileWithContent {
	
	private File file;
	private String input;
	private Scanner scan = new Scanner(System.in);
	private String content = "Everyone has something that annoys them about the fitness industry. "
			+ "From supplement companies' unsavory marketing tactics to self-proclaimed guru's unfounded claims, "
			+ "most every self-respecting fitness professional has some pet peeve which the mere mention makes them cringe. "
			+ "For Paul San Andres, that pet peeve is in the area of program design.";
	
	/**
	 * Creates file.
	 * @throws IOException
	 */
	public void createNewFile () throws IOException {
		file = new File ("randomContent.txt");
		file.createNewFile();
	}
	
	/**
	 * Writes content into file.
	 * @throws IOException
	 */
	public void writeContent () throws IOException {
		FileWriter fw = null;
		fw = new FileWriter("randomContent.txt");
		fw.write(content);
		fw.close();
	}
	
	/**
	 * Gets user input and returns it.
	 * @return input.
	 */
	public String getInput() {
		System.out.println("Enter word you searching for: ");
		input = scan.next();
		return input;
	}
	
	/**
	 * Read content and split to separate words.
	 * Takes user input from another method.
	 * Replaces all dots and unnecessary symbols to define words.
	 * Compare user input and iterate, then counts if equal.
	 * @throws IOException
	 */
	public void findWords () throws IOException {
		String [] words = null;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String stringArray;
		input = getInput();
		int count = 0;   
	      while((stringArray = br.readLine()) != null) {
	    	 stringArray = stringArray.replace(".", "");
	    	 stringArray = stringArray.replace(",", "");
	    	 stringArray = stringArray.replace("'", "");
	    	 stringArray = stringArray.replace("-", " "); // separates self-proclaimed and self-respecting words. 
	         words = stringArray.split(" "); 
	         System.out.println(Arrays.toString(words));
	          for (String word : words) {
	                 if (word.equals(input)) {
	                   count++;  
	                 }
	          }
	      }
	      if (count != 0) { 
	         System.out.println("The given word is present for " + count + " Times in the file");
	      } else {
	         System.out.println("The given word is not present in the file");
	      }
	         fr.close();
	}
	
}
