package com.prowings.collection.map;

import java.util.Arrays;
import java.util.HashMap;

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
		
		for(String k : wordCountMap.keySet())
		{
			System.out.println(k +" : " + wordCountMap.get(k));
		}

	}

}
