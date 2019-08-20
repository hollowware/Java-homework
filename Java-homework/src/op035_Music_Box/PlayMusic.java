package op035_Music_Box;

import java.io.IOException;

public class PlayMusic {
	public static void main(String[] args) throws IOException {
		
	ShowPlayList showPlayList = new ShowPlayList();
	showPlayList.findAllSongs(); 
	System.out.println();
	PrintLyrics printLyrics = new PrintLyrics();
	printLyrics.printSongLyrics();
	
	}
}
