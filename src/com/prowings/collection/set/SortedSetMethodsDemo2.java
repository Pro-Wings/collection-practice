package com.prowings.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetMethodsDemo2 {

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
		
		System.out.println(ts.first()); //lowest
		System.out.println(ts.last()); // highest
		
		TreeSet ts2 = (TreeSet) ts.headSet(30);
		System.out.println(">>>>>>>>>>> HEADSET >>>>>>"+ts2);
		TreeSet ts3 = (TreeSet) ts.tailSet(30);
		System.out.println(">>>>>>>>>>> TAILSET >>>>>>"+ts3);
 		
		TreeSet ts4 = (TreeSet) ts.subSet(20, 50);
		System.out.println(">>>>>>>>>>> SUBSET >>>>>>"+ts4);
		
		
	}
	
	
}
