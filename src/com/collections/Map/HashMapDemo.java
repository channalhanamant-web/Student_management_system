package com.collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> countryCapitalMap = new HashMap<String, String>();
		LinkedHashMap<String, String> countryCapitalLinkedHashMap = new LinkedHashMap<String, String>();
		TreeMap<String, String> countryCapitalTreeMap = new TreeMap<String, String>();
		
		countryCapitalMap.put("India", "New Delhi");
		countryCapitalMap.put("USA", "Washington DC");
		countryCapitalMap.put("UK", "London");

		countryCapitalLinkedHashMap.put("India", "New Delhi");
		countryCapitalLinkedHashMap.put("USA", "Washington DC");
		countryCapitalLinkedHashMap.put("UK", "London");
		
		countryCapitalTreeMap.put("India", "New Delhi");
		countryCapitalTreeMap.put("USA", "Washington DC");
		countryCapitalTreeMap.put("UK", "London");
		
		System.out.println(countryCapitalMap.get("India"));

		System.out.println(countryCapitalMap.keySet());
		System.out.println(countryCapitalLinkedHashMap.keySet());
		System.out.println(countryCapitalTreeMap.keySet());

		// traversing Map

		for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
			System.out.println(entry.getKey() + "------> " + entry.getValue());
		}

		
	}

}
