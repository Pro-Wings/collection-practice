package com.prowings.collections;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.name.compareTo(p2.name);
	}

}
