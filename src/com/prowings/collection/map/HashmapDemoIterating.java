package com.prowings.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemoIterating {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> myMap = new HashMap<>();
		
		myMap.put("AAA", 123);
		myMap.put("AAA", 321);
		myMap.put(null, 456);
		myMap.put(null, 007);
		myMap.put("BBB", null);
		myMap.put("CCC", 567);
		myMap.put("DDD", 567);
		
		System.out.println(myMap);

		System.out.println("Iterating by keyset() with Iterator : ");
		Set<String> keySet = myMap.keySet();
		
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key + "    " + myMap.get(key));
		}
		
		System.out.println("Iterating by entryset() with Iterator : ");

		Set<Map.Entry<String, Integer>> entries = myMap.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr2 = entries.iterator();
		
		while(itr2.hasNext())
		{
			Map.Entry<String, Integer> e = itr2.next();
			
			System.out.println(e.getKey()  +"   "  + e.getValue());
		}
		
		System.out.println("Iterating by keyset() with for-each : ");
		
		Set<String> keySet2 = myMap.keySet();
		
		for(String k : keySet2)
		{
			System.out.println(k + "  " + myMap.get(k));
		}
		
		System.out.println("Iterating by entryset() with for-each : ");
		
		Set<Map.Entry<String, Integer>> entries2 = myMap.entrySet();
		
		for(Map.Entry<String, Integer> e : entries2)
		{
			System.out.println(e.getKey() + "  " + e.getValue());
		}

	}

}
