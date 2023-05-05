package com.prowings.collection.generics;

import java.util.ArrayList;

public class TestGenerics3 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		
		al.add("lkj");
		al.add("lkj");
		al.add("lkj");
		al.add(123);
		
		
		String s = (String) al.get(3);
		
		
		ArrayList<String> al2 = new ArrayList<>();
		
		al2.add("hello");
		al2.add("hello");
		al2.add("hello");
		al2.add("hello");
		
		String s1 = al2.get(0);
		
	}
}
