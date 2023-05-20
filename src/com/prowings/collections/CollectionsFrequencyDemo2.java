package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsFrequencyDemo2 {
	
	public static void main(String[] args) {
		
		String input = "India is my country India is beautiful";
		
		List<String> words = Arrays.asList(input.split(" "));
		
		System.out.println(words);
		
		Set<String> wordsSet = new HashSet<>(words);
		
		System.out.println(wordsSet);
		
		for(String w : wordsSet)
		{
//			System.out.println(w +  " occurred " + Collections.frequency(words, w) + " times");
			System.out.println(w +  " = " + Collections.frequency(words, w));
		}
		
	}

}
