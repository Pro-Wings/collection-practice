package com.prowings.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_ListIteratorDemo {
	
	
	public static void main(String[] args) {
		
		
		LinkedList myLinkedlist = new LinkedList<>();
		
		myLinkedlist.add("AAA");
		myLinkedlist.add("BBB");
		myLinkedlist.add("10");
		myLinkedlist.add("BBB");
		myLinkedlist.add("20");
		myLinkedlist.add("CCC");
		myLinkedlist.add("DDD");
		
//		System.out.println(myLinkedlist.size());
		
		ListIterator ltr = myLinkedlist.listIterator(4);
		

		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}

}
