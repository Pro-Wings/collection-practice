package com.prowings.collection.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestArrayList2 {
	
	public static void main(String[] args) throws Exception {
		
		
		ArrayList al = new ArrayList();
		
		int i = 40;
		
		al.add("hello");
		al.add(20);

		
		ArrayList al2 = new ArrayList<>();
		
		al2.add("hello");
		al2.add(20);
		al2.add("hello");
		al2.add("hi");
		al2.add(10);
		al2.add(i);//autobox

		
		ArrayList al3 = new ArrayList<>();
		al3.addAll(al2);
		
		System.out.println("before remove : "+al2);
		
//		al2.removeAll(al);
		
//		System.out.println(al2.contains(10));
//		System.out.println(al2.containsAll(al));
		
//		al2.retainAll(al);
		
//		System.out.println(al2.isEmpty());
//		System.out.println(al2.size());
		
//		al2.clear();
		
		System.out.println(al2.hashCode());
		System.out.println(al2.equals(al3));
		
		System.out.println("after remove : "+al2);
		
	}

}
