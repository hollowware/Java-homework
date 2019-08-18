package op030_Currency;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class CurrencyFileRoaming {
	
    String from;
    String to;
    double ratioToEuro;
    double ratioToOtherCurrency;
    double amountOfMoney;

    private List<String> cash = new ArrayList<String>();
    private List<String> ratios = new ArrayList<String>();

    public CurrencyFileRoaming(String from, String to, double amountOfMoney) {
        this.from = from;
        this.to = to;
        this.amountOfMoney = amountOfMoney;
    }

    public void readFile(String from, String to) {
        try {
            RandomAccessFile file = new RandomAccessFile("currency.txt", "r");
            String string;
            while ((string = file.readLine()) != null) {
                cash.add(string.substring(0, 3).toLowerCase());
                int startIndex = 0;
                char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                for (int i = 0; i < string.length(); i++) {
                    for (int j = 0; j < nums.length; j++) {
                        char a = string.charAt(i);
                        char b = nums[j];
                        if (a == b) {
                            startIndex = i;
                            break;
                        }
                    }
                    if (startIndex > 0) {
                        break;
                    }
                }
                ratios.add(string.substring(startIndex, string.length() - 1));
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < cash.size(); i++){
            if (cash.get(i).equals(from)){
                ratioToEuro = Double.parseDouble(ratios.get(i));
               break;
            }
        }
        for (int i = 0; i < cash.size(); i++){
            if (cash.get(i).equals(to)){
                ratioToOtherCurrency = Double.parseDouble(ratios.get(i));
                break;
            }
        }
    }

    public double Convert(double amountOfMoney){
        amountOfMoney = (amountOfMoney/ratioToEuro)*ratioToOtherCurrency;
        System.out.format("%.2f%n", amountOfMoney);
        return amountOfMoney;
    }

}
