package com.prowings.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		
		lhs.add("aaa");
		lhs.add("bbb");
		lhs.add("aaa");
		lhs.add("ccc");
		lhs.add("ddd");
		lhs.add("ccc");
		
		System.out.println(lhs);
	}

}
