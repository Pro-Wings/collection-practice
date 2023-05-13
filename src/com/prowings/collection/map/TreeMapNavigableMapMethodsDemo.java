package com.prowings.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapNavigableMapMethodsDemo {
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(10, "AAA");
		tmap.put(50, "EEE");
		tmap.put(40, "DDD");
		tmap.put(20, "BBB");
		tmap.put(30, "CCC");
		
		System.out.println(tmap);
		
		Comparator cmp = tmap.comparator();
		
		System.out.println(cmp);
		
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());
		
		
		Map<Integer, String> headMap = tmap.headMap(50);
		System.out.println(headMap);

		Map<Integer, String> tailMap = tmap.tailMap(30);
		System.out.println(tailMap);

		Map<Integer, String> subMap = tmap.subMap(30, 50);
		System.out.println(subMap);
		
		System.out.println("lower key : "+tmap.lowerKey(30));
		System.out.println("lower entry : "+tmap.lowerEntry(50));

		System.out.println("higher key : "+tmap.higherKey(10));
		System.out.println("higher entry : "+tmap.higherEntry(30));
		
		System.out.println("ceiling key : "+ tmap.ceilingKey(16));
		System.out.println("ceiling Entry : "+ tmap.ceilingEntry(34));

		System.out.println("floor key : "+ tmap.floorKey(16));
		System.out.println("floor Entry : "+ tmap.floorEntry(34));

		System.out.println("Poll first Entry : "+ tmap.pollFirstEntry());
		System.out.println("Poll last Entry : "+ tmap.pollLastEntry());

		System.out.println("after poll method : "+tmap);
		
		Set<Integer> decendingKeys = tmap.descendingKeySet();
		
		System.out.println(decendingKeys);
	}

}
