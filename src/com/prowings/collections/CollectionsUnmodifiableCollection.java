package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsUnmodifiableCollection {
	
	
	public static void main(String[] args) {
		
		List<String> returnedList = method1();
		System.out.println("before modification : "+returnedList);
		returnedList.add("123");
		System.out.println("after modification : "+returnedList);
	}

	private static List<String> method1() {
		
		List<String> mylist = new ArrayList<>();
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("ccc");
//		return mylist;
		return Collections.unmodifiableList(mylist);
	}
	private static Set<String> method2() {
		
		Set<String> mySet = new HashSet();
		mySet.add("bbb");
		mySet.add("aaa");
		mySet.add("eee");
		mySet.add("ccc");
		return Collections.unmodifiableSet(mySet);
	}

	private static Map<String, Integer> method3() {
		
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("aaa", 123);
		myMap.put("bbb", 123);
		myMap.put("ccc", 123);
		return Collections.unmodifiableMap(myMap);
	}

	private static Collection<String> method4() {

		Collection<String> myCollection = new ArrayList<String>();
		myCollection.add("aaa");
		myCollection.add("bbb");
		myCollection.add("ccc");
		
		return Collections.unmodifiableCollection(myCollection);
	}

}
