package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsSwapMethod {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("ccc");
		System.out.println("Original List : " + mylist);
		
		Collections.swap(mylist, 1,3);
		
		System.out.println("Shuffled List : " + mylist);
	}

}
