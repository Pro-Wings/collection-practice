package com.prowings.collections;

import java.util.Comparator;

public class PersonIdComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		if(p1.id == p2.id)
			return 0;
		else if(p1.id > p2.id)
			return 3;
		else
			return -2;
	}

}
