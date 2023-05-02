package com.prowings.collection.set.treesetexercise;

import java.util.Comparator;

public class StudentRollNoComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Student std1 = (Student) o1;
		Student std2 = (Student) o2;
		
		
		if(std1.roll == std2.roll)
			return 0;
		else if(std1.roll > std2.roll)
			return 3;
		else
			return -3;
		
	}

}
