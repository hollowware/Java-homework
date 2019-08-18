package op030_Currency;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class ShowAvailableCurrencies {
	
	public static void fillList(List allCurencies) {
        try {
            RandomAccessFile file = new RandomAccessFile("currency.txt", "r");
            String str;
            while ((str = file.readLine()) != null) {
                allCurencies.add(str.substring(0, 3));
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
