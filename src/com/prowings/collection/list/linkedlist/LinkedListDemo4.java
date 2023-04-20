package com.prowings.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo4 {
	
	
	public static void main(String[] args) {
		
		
		LinkedList mylist = new LinkedList<>();
		
		mylist.add("AAA");
		mylist.add("BBB");
		mylist.add("10");
		mylist.add("BBB");
		mylist.add("20");
		mylist.add("CCC");
		mylist.add("DDD");
		
		System.out.println("before : "+mylist);
		
		mylist.addFirst("VVV");
		mylist.addLast("ZZZ");

		
		System.out.println("element() ===> "+mylist.element());
		System.out.println("getFirst() ===> "+mylist.getFirst());
		System.out.println("getLast() ===> "+mylist.getLast());
		
		mylist.offer("XXX");
		mylist.offerFirst("QQQ");
		mylist.offerLast("RRR");

		
		System.out.println("peek() ===> "+mylist.peek());
		System.out.println("peekFirst() ===> "+mylist.peekFirst());
		System.out.println("peekLast() ===> "+mylist.peekLast());

//		System.out.println("poll() ===> "+mylist.poll());
		System.out.println("pop() ===> "+mylist.pop());
		
		System.out.println("after : "+mylist);
		
		
		
	}

}
