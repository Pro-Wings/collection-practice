package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsReplaceMethod {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("aaa");
		mylist.add("ccc");
		mylist.add("aaa");
		System.out.println("Original List : " + mylist);
		
//		TreeSet<String> sortedList = new TreeSet<>(mylist);

		Collections.replaceAll(mylist, "aaa", "zzz");
		
		System.out.println("After replace all List : " + mylist);
	}

}
