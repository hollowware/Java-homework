package op031_BrowsingFoldersAndFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFilesAndFolders {
	
	public static void main(String[] args) throws IOException {
		
//		createNewFolder();
		createNewFile(); 
		findAllFiles();
	}

	private static void createNewFolder() {
		File newFolder = new File("HomeworkFolder");
		boolean checkOrExists = newFolder.mkdir();
		System.out.println(checkOrExists);
	}
	
	/**
	 * Creates new files through iteration.
	 * Prints found files names.
	 * Writes same sentence into each file using iteration.
	 * @throws IOException
	 */
	private static void createNewFile() throws IOException {
		File file;
		FileWriter fw = null;
		for ( int i = 1; i <= 15; i++ ) {
			file = new File( "HomeworkFolder\\" + "File" + i + ".txt" );
			file.createNewFile();
			System.out.println(file.getName());
			fw = new FileWriter("HomeworkFolder\\" + file.getName()); 
			fw.write("Welcome to the desert, find a water please.");  
		    fw.close();    
		}
	}
	
	/**
	 * Finds all files inside chosen directory.
	 * Renames all files through iteration.
	 * @throws IOException
	 */
	private static void findAllFiles() throws IOException {
		String newName = "Desert";
		File directory = new File ("HomeworkFolder");
		File[] directoryListing = directory.listFiles();
		if (directoryListing != null) {
			for (int i = 0; i < directoryListing.length; i++) {
				if (directoryListing[i].isFile()) {
	                File newRenamedFile = new File("HomeworkFolder\\" + directoryListing[i].getName()); 
	                newRenamedFile.renameTo(new File("HomeworkFolder\\" + newName + i + ".txt"));
	            }
			}
		}
	}
	
}

