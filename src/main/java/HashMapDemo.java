import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.TreeMap;

public class HashMapDemo {

    /*
    Problem 1: Find the highest stock price#
    Find the company with the highest stock price.

    Problem 2: Find the average stock price
    Find the average stock price of all the companies

    Problem 3: Remove companies with stock price below 50
    */
    public static void main(String args[]) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

        Optional<Entry<String, Integer>> highestStockEntry = stockPrice.entrySet().stream().sorted(Entry.comparingByValue()).reduce((r1, r2) -> r2);

        System.out.println(highestStockEntry.get().getValue());

        // Problem 2: Find the average stock price Find the average stock price of all the companies
        OptionalDouble avg = stockPrice.values().stream().mapToDouble(Integer::doubleValue).average();

        System.out.println(avg.getAsDouble());

        // Problem 3: Remove companies with stock price below 50
        stockPrice.entrySet().removeIf(stringIntegerEntry -> stringIntegerEntry.getValue() < 50);

        System.out.println(stockPrice);


    }

}
