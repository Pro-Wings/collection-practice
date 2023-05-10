package com.prowings.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapKeySetMethodDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> myMap = new HashMap<>();
		
		System.out.println(myMap.size());
		System.out.println(myMap.isEmpty());
		
		System.out.println(myMap.put("AAA", 123));
		System.out.println(myMap.put("AAA", 321));
		System.out.println(myMap.put(null, 007));
		System.out.println(myMap.put("BBB", null));
		System.out.println(myMap.put("CCC", 567));
		System.out.println(myMap.put("DDD", 567));
		
		
		System.out.println(myMap);
		
		
		Set<String> setOfKeys = myMap.keySet();
		
		Iterator<String> itr = setOfKeys.iterator();

		System.out.println("Iterating over Keys of HashMap : ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
