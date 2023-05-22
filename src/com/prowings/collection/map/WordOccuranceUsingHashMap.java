package com.prowings.collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordOccuranceUsingHashMap {
	
	public static void main(String[] args) {
		
		
		String input = "India is my country India has 29 states India is beautiful country";
		
		//OP should be occurance of each word from input string
		
		String[] words = input.split(" ");
		
		System.out.println(Arrays.toString(words));
	
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		for(String word : words)
		{
			Integer oldCount = wordCountMap.get(word);
			
			if (oldCount == null)
			{
				wordCountMap.put(word, 1);
			}
			else
			{
				wordCountMap.put(word, oldCount+1);
			}
		}
		
		System.out.println("before sorting by values : " + wordCountMap);
		
		Map<String, Integer> sortByCountMap = sortByValues(wordCountMap);

		System.out.println("after sorting by values : " + sortByCountMap);
		
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
