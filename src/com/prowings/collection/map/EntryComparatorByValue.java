package com.prowings.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class EntryComparatorByValue implements Comparator<Map.Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		
		return e1.getValue().compareTo(e2.getValue());
	}

}
