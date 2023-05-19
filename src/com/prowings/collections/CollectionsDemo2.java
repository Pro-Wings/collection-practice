package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsDemo2 {
	
	
	public static void main(String[] args) {

		Person p1 = new Person(234, "BBB");
		Person p2 = new Person(789, "AAA");
		Person p3 = new Person(567, "CCC");
		
		
		ArrayList<Person> mylist = new ArrayList<>();
		
		mylist.add(p1);
		mylist.add(p2);
		mylist.add(p3);
		
		System.out.println("Original List : " + mylist);
		
//		TreeSet<String> sortedList = new TreeSet<>(mylist);

//		Collections.sort(mylist);   //this is sort method accepting comparable type elements list
		
		PersonNameComparator pn = new PersonNameComparator();
		PersonIdComparator pi = new PersonIdComparator();
		
//		Collections.sort(mylist, pi); // sort by id
		Collections.sort(mylist, pn); // sort by name
		
		System.out.println("Sorted List : " + mylist);
	}

}
