package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListDemo {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<>();
		
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("ccc");
		System.out.println("Original List : " + mylist);


		List<String> mySynchronizedList = Collections.synchronizedList(mylist);

		System.out.println(mySynchronizedList);
		
		
	}
}
