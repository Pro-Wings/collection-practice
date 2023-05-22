package com.prowings.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortMapByValues {

	public static void main(String[] args) {

		HashMap<String, Integer> marks = new HashMap<>();

		marks.put("Math", 98);
		marks.put("Datastructure", 85);
		marks.put("Database", 91);
		marks.put("Java", 95);
		marks.put("Operating System", 79);
		marks.put("Networking", 80);

		System.out.println("Map before sorting by values : " + marks);
		
		Map<String, Integer> sortedMarks = sortByMarks(marks);
		
		
		System.out.println("Map after sorting by values : " + sortedMarks);
		
	}

	private static Map<String, Integer> sortByMarks(HashMap<String, Integer> marks) {
		
		//#1 : create a set of entries
		Set<Map.Entry<String, Integer>> entriesSet = marks.entrySet();
		//#2: convert set of entries into List of entries
		List<Map.Entry<String, Integer>> entriesList = new ArrayList<>(entriesSet);
		//#3: sort the list of entries using a custom comparator of Map.Entry - by values
		Collections.sort(entriesList, new EntryComparatorByValue());
		//#4: store each entry from sorted list into LinkedHashMap (to maintain insertion order)
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> entry : entriesList)
		{
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		//#5: return the sorted map 
		return sortedMap;
	}

}
