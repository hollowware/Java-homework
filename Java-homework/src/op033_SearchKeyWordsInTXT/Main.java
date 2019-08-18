package op033_SearchKeyWordsInTXT;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		CreateNewFileWithContent file = new CreateNewFileWithContent();
		file.createNewFile();
		file.writeContent();
		file.findWords();
	}
}
