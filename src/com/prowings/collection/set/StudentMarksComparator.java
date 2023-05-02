package com.prowings.collection.set;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		if(std1.marks > std2.marks)
			return -3;
		else if(std1.marks < std2.marks)
			return 2;
		else
			return 0;
	}
	

}
