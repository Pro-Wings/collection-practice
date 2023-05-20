package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDisjointMethodDemo {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("aaa");
		myList.add("bbb");
		myList.add("ccc");

		Set<String> mySet = new HashSet();
		
		mySet.add("zzz");
		mySet.add("vvv");
		mySet.add("www");

		List<String> myAnotherList = new ArrayList<>();
		
		myAnotherList.add("ppp");
		myAnotherList.add("aaa");
		myAnotherList.add("rrr");
		
		
		System.out.println(Collections.disjoint(myList, myAnotherList));		
		System.out.println(Collections.disjoint(myList, mySet));		
		
	}

}
