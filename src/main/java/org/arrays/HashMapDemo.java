package org.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

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

		TreeMap<String, Integer> treeMap = new TreeMap<>(stockPrice);

		System.out.println(treeMap.firstEntry());
		
	
		
	}
}