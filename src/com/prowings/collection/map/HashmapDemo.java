package com.prowings.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> myMap = new HashMap<>();
		
		System.out.println(myMap.size());
		System.out.println(myMap.isEmpty());
		
		System.out.println(myMap.put("AAA", 123));
		System.out.println(myMap.put("AAA", 321));
		System.out.println(myMap.put(null, 456));
		System.out.println(myMap.put(null, 007));
		System.out.println(myMap.put("BBB", null));
		System.out.println(myMap.put("CCC", 567));
		System.out.println(myMap.put("DDD", 567));
		
		System.out.println("size : "+myMap.size());
		System.out.println("isEmpty : "+myMap.isEmpty());
		
		System.out.println("get(K) ====> "+myMap.get("AAA"));
		System.out.println("get(K) ====> "+myMap.get("XXX"));
		
		System.out.println(myMap.containsKey("BBB"));
		System.out.println(myMap.containsKey("XXX"));
		
		System.out.println(myMap.containsValue(567));
		System.out.println(myMap.containsValue(987));
		
		
		Map<String, Integer> myMap2 = new HashMap<>();
		
		myMap2.putAll(myMap);
		
		System.out.println("myMap2 : " + myMap2);

		myMap2.clear();
		
		System.out.println("myMap2 after clear : " + myMap2);
		
		
		
		System.out.println("before remove : "+myMap);
		myMap.remove("CCC");
		System.out.println("after remove : "+myMap);
		
		
	}

}
