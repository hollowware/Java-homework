package op035_Music_Box;

import java.io.*;

public class ShowPlayList {
	
	public void findAllSongs() throws IOException {
		File dir = new File("Songs");
		File[] directoryListing = dir.listFiles();
		  if (directoryListing != null) {
		    for (int i = 0; i < directoryListing.length; i++) {
		    		BufferedReader brTest = new BufferedReader(new FileReader(directoryListing[i]));
		    		String text = brTest.readLine();
		    		System.out.println(text);
		    }
		  } else {
			  System.out.println("Play List is empty.");
		  }
	}
	
}
