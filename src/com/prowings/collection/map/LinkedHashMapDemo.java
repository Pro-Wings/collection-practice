package com.prowings.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		
		lmap.put("AAA", 123);
		lmap.put("BBB", 456);
		lmap.put("AAA", 999);
		
		lmap.put(null, 999);
		
		lmap.put("CCC", 678);
		
		System.out.println(lmap);
		
	}
	
}
