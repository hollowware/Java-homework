package op032_Chat;

import java.io.*;
import java.util.*;

public class WriteToFile {
	public static void writeClientInfoToFile(String clientInfo, String clientPath) {
        try (FileOutputStream fos = new FileOutputStream(clientPath, true)){
            PrintWriter registration = new PrintWriter(fos);
            if (readFile(clientPath, clientInfo) == 0){ //jeigu failas - tuscias
                registration.println(clientInfo); //irsaso kliento informacijos eilute
                registration.flush(); // nuleido
                registration.close(); // uzdare dangti.
            }
            if (readFile(clientPath, clientInfo) == 1) { //jeigu failas - sukurtas ir netuscias
                registration.println(clientInfo);//irsaso kliento informacijos eilute
                registration.flush(); // nuleido
                registration.close(); // uzdare dangti.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads given file line by line, pushes all lines to list, and then searches in that list of unique line.
     * @param pathToRead
     * @param clientInfo
     * @return
     */
    public static int readFile(String pathToRead, String clientInfo) {
        int newLineInClientBook = 0; // praso iniciavimo, tik del to FALSE.
        List<String> allThisFileLines = readAllGivenFileLinesAndReturnListOfAllLines(pathToRead);

        for (int i = 0; i < allThisFileLines.size(); i++) { // iteruojasi per visas eilutes (viena eilute - vienas elementas)
            if (allThisFileLines.size() == 0) {
                newLineInClientBook = 0; // jeigu esi tuscias, tai ok as irasysiu papildoma eilute.
            } else if (!allThisFileLines.contains(clientInfo)) { // jeigu ne tuscias "!", klausiu ar neturi jau tokio pacio "contains".
                newLineInClientBook = 1; // jeigu turi(contains), tai neirasau.
            } else {
                newLineInClientBook = 2;
            }
        }
        return newLineInClientBook;
    }
    private static List<String> readAllGivenFileLinesAndReturnListOfAllLines(String pathToRead) {
        List<String> allThisFileLines = new ArrayList<String>(); // sukuria failo eiluciu sarasa.
        try (Scanner scanner = new Scanner(new File(pathToRead))) { //skaito nurodyta faila
            while (scanner.hasNextLine()) { // kol randa ka skaityti tol irasineja failo eilutes i sarasa.
                allThisFileLines.add(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return allThisFileLines; //grazina perskaitytu eiluciu sarasa
    }
}
