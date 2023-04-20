package com.prowings.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo3 {
	
	
	public static void main(String[] args) {
		
		
		LinkedList myLinkedlist = new LinkedList<>();
		
		myLinkedlist.add("AAA");
		myLinkedlist.add("BBB");
		myLinkedlist.add("10");
		myLinkedlist.add("BBB");
		myLinkedlist.add("20");
		myLinkedlist.add("CCC");
		myLinkedlist.add("DDD");
		
		
		System.out.println(myLinkedlist);
		
		myLinkedlist.push("OOOOO");
		myLinkedlist.add("ZZZZ");
		System.out.println(myLinkedlist);
		
	}

}
