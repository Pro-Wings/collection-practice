package com.prowings.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestArrayList4 {
	
	public static void main(String[] args) throws Exception {
		
		
		ArrayList al = new ArrayList();
		
		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(40);
		al.add("hi");
		al.add("hello");

		
		Object[] myArr = al.toArray();

		System.out.println(Arrays.toString(myArr));
		
		
		
	}

}
