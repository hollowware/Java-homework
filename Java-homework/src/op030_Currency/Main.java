package op030_Currency;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         List<String> allCurencies = new ArrayList<String>();
         fillList(allCurencies);
        System.out.println("Avalable currencies: \n" +allCurencies.toString());
        Scanner input = new Scanner(System.in);
        System.out.print("Convert form currency");
        String from = input.next().toLowerCase();
        System.out.print("Amount of money: ");
        double amountOfMoney = input.nextDouble();
        System.out.print("Convert to currency");
        String to = input.next().toLowerCase();

        Currency currencyChange = new Currency(from, to,amountOfMoney);
        currencyChange.readFile(from, to);
        currencyChange.Convert(amountOfMoney);

        }

    private static void fillList(List allCurencies) {
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

