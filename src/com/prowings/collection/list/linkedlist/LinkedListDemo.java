package com.prowings.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		
		
		LinkedList mylist = new LinkedList<>();
		
		mylist.add("AAA");
		mylist.add("BBB");
		mylist.add("10");
		mylist.add("BBB");
		mylist.add("20");
		mylist.add("CCC");
		mylist.add("DDD");
		
		System.out.println(mylist.size());
		
		System.out.println(mylist);
		
		mylist.pop();
		
		System.out.println(mylist);
		
	}

}
