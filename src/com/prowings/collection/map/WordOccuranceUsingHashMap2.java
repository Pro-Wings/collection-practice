package com.prowings.collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WordOccuranceUsingHashMap2 {
	
	public static void main(String[] args) {
		
		
		String input = "india is my country india has 29 states india is beautiful country";
		
		//OP should be occurance of each word from input string
		
		String[] words = input.split(" ");
		
		System.out.println(Arrays.toString(words));
	
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		
		for(String word : words)
		{
			
			if(wordCountMap.containsKey(word))
				wordCountMap.put(word, wordCountMap.get(word)+1);
			else
				wordCountMap.put(word, 1);
		}
		
		for(String k : wordCountMap.keySet())
		{
			System.out.println(k +" : " + wordCountMap.get(k));
		}
		
		System.out.println(">>>>>>>>>>> after sort by keys <<<<<<<<<<<");
		TreeMap<String, Integer> sortedMap = new TreeMap<>(wordCountMap);
		System.out.println(sortedMap);
		
		System.out.println(">>>>>>>>>>> after sort by Values <<<<<<<<<<<");
		Map<String, Integer> sortByCountMap = sortByValues(wordCountMap);
		System.out.println(sortByCountMap);

		
	}

	
	private static Map<String, Integer> sortByValues(HashMap<String, Integer> map) {
		
		Set<Map.Entry<String, Integer>> entriesSet = map.entrySet();
		
		List<Map.Entry<String, Integer>> entriesList = new ArrayList<>(entriesSet);
		
		Collections.sort(entriesList, new EntryComparatorByValue());
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> entry : entriesList)
		{
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

	
}
