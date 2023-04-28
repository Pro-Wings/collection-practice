package com.prowings.collection.set;

import java.util.Comparator;

public class PersonNameComparator implements Comparator{

	@Override
	public int compare(Object p1, Object p2) {
		
		Person prsn1 = (Person) p1;
		Person prsn2 = (Person) p2;

		return prsn1.name.compareTo(prsn2.name);
	}

}
