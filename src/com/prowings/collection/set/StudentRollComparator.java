package com.prowings.collection.set;

import java.util.Comparator;

public class StudentRollComparator implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		if(std1.roll > std2.roll)
			return 3;
		else if(std1.roll < std2.roll)
			return -2;
		else
			return 0;
	}
	

}
