package op030_Currency;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) { 
    	 
        List<String> allCurencies = new ArrayList<String>();
        ShowAvailableCurrencies.fillList(allCurencies);
        System.out.println("Available currencies: \n" + allCurencies);
        System.out.print("What currency you have?");
        String from = input.next().toLowerCase();
        System.out.print("Amount of that currency: ");
        double amountOfMoney = input.nextDouble();
        System.out.print("Convert to currency: ");
        String to = input.next().toLowerCase();

        CurrencyFileRoaming currencyChange = new CurrencyFileRoaming(from, to, amountOfMoney);
        currencyChange.readFile(from, to); 
        currencyChange.Convert(amountOfMoney);

        }
}
