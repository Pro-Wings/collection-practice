package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseMethod {

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

		Collections.reverse(mylist);

		System.out.println("Reversed List : "+ mylist);
	}
	
}
