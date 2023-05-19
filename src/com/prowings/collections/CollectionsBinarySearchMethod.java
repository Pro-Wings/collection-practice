package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsBinarySearchMethod {

	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("ccc");
		mylist.add("fff");
		mylist.add("ggg");
		mylist.add("ddd");
		System.out.println("Original List : " + mylist);

//		Collections.sort(mylist);
		
		int index = Collections.binarySearch(mylist, "aaa");
		
		System.out.println(index);
	}
	
}
