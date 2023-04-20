package com.prowings.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo2 {
	
	
	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList<>();
		mylist.add("AAA");
		mylist.add("BBB");
		mylist.add("10");
		mylist.add("BBB");
		mylist.add("20");
		mylist.add("CCC");
		mylist.add("DDD");

//		LinkedList mylinkedlist = new LinkedList(mylist); //conversion constructor
		LinkedList mylinkedlist = new LinkedList(); //no arg constructor
		
		mylinkedlist.addAll(mylist);
		
		System.out.println(mylist.size());
		
		System.out.println(mylist);
		System.out.println(">>>>>>>>>>");
		System.out.println(mylinkedlist);
		
		
		
	}

}
