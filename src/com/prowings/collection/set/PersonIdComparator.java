package com.prowings.collection.set;

import java.util.Comparator;

public class PersonIdComparator implements Comparator{

	@Override
	public int compare(Object p1, Object p2) {
		
		Person prsn1 = (Person) p1;
		Person prsn2 = (Person) p2;

		if(prsn1.id == prsn2.id)
			return 0;
		else if(prsn1.id > prsn2.id)
			return 4;
		else
			return -3;
	}

}
