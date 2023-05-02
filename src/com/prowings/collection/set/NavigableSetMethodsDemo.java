package com.prowings.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class NavigableSetMethodsDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(20);
		ts.add(10);
		ts.add(05);
		ts.add(50);
		ts.add(30);
		ts.add(60);
		ts.add(40);
		
		
		System.out.println(ts);
		
		System.out.println(ts.lower(60)); // less than
		System.out.println(ts.higher(40)); //greater than
		
		
		System.out.println(ts.ceiling(45)); //greater than equal to
		System.out.println(ts.floor(87)); // less than equal to
		
		
		System.out.println(ts.pollFirst());
		System.out.println("after pollFirst : "+ts);
		
		System.out.println(ts.pollLast());
		System.out.println("after pollLast : "+ts);
		
		System.out.println("Using Iterator : ");
		Iterator itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Using DescendingIterator : ");
		Iterator itr1 = ts.descendingIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		TreeSet myts = (TreeSet) ts.descendingSet();
		
		System.out.println(myts);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		
		TreeSet myTs1 = (TreeSet) ts.headSet(30, true);
		System.out.println("HeadSET : "+myTs1);

		TreeSet myTs2 = (TreeSet) ts.tailSet(30, true);
		System.out.println("TAILSET"+myTs2);
		
		TreeSet myTs3 = (TreeSet) ts.subSet(20, true, 50, true);
		System.out.println("SUBSET : "+myTs3 );
		
	}
	
	
}
