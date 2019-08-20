package op035_Music_Box;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class PrintLyrics {
	
	public void printSongLyrics() throws IOException {
		File dir = new File("Songs");
		File[] directoryListing = dir.listFiles();
		  if (directoryListing != null) {
		    for (int i = 0; i < directoryListing.length; i++) {
		    	Path path = Paths.get("Songs\\" + ChooseSong.getStringInputValue() + ".txt");
		    	List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		    	for (String line : lines) {
		    	   System.out.println(line); 
		    	}
		    }
		  } 
	}
	
}
