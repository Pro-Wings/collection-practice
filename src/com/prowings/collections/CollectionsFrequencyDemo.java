package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequencyDemo {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("aaa");
		myList.add("bbb");
		myList.add("aaa");
		myList.add("ccc");
		myList.add("aaa");
		myList.add("ddd");
		
		
		int count = Collections.frequency(myList, "aaa");
		
		System.out.println(count);
	}

}
