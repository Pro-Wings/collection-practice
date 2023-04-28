package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetDemoUsingComparator {

	public static void main(String[] args) {

		Person p1 = new Person(30, "Vijay");
		Person p2 = new Person(50, "Ram");
		Person p3 = new Person(10, "Sham");
		//sort Emp by name
		
		PersonIdComparator obj = new PersonIdComparator();
		
		PersonNameComparator obj2 = new PersonNameComparator();
		
		TreeSet ts = new TreeSet(obj2);
//		TreeSet ts = new TreeSet(obj);

		ts.add(p1);
		ts.add(p2);
		ts.add(p3);

		System.out.println(ts);
	}

}
