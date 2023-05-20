package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsSingltonListDemo2 {
	
	
	public static void main(String[] args) {
		
		List<String> myList = Collections.singletonList("ZZZ");
		
		System.out.println(myList);
		
//		myList.add("yyy"); // will result into UnsupportedOperationException
		
		
		Set<String> mySet = Collections.singleton("AAA");
		
		System.out.println(mySet);
		
//		mySet.add("ccc"); // will result into UnsupportedOperationException
		
		
		Map<String, Integer> myMap = Collections.singletonMap("AAA", 123);
		
		System.out.println(myMap);
		
		myMap.put("BBB", 345); // will result into UnsupportedOperationException
		
	}

}
