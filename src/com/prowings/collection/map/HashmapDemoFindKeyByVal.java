package com.prowings.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemoFindKeyByVal {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> myMap = new HashMap<>();
		
		System.out.println(myMap.put("AAA", 123));
		System.out.println(myMap.put("BBB", 999));
		System.out.println(myMap.put("CCC", 333));
		System.out.println(myMap.put("DDD", 567));
		
		
		System.out.println("find key by specified value : ");
		
		Integer value = 999;
		
		String key = getKey(myMap, value);
		
		System.out.println("Key is : "+ key);
		
		
	}

	private static String getKey(Map<String, Integer> map, Integer value) {
		
		Set<String> keySet = map.keySet();
		Integer val = null;
		for(String k : keySet)
		{
			val = map.get(k);
			if(val.equals(value))
				return k;
		}
		return null;
	}

}
