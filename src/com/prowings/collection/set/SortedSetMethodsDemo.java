package com.prowings.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetMethodsDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram", 75);
		Student s2 = new Student(02, "AAA", 89);
		Student s3 = new Student(04, "Sham", 39);
		
		
//		TreeSet ts = new TreeSet<>(new StudentNameComparator());
//		TreeSet ts = new TreeSet<>(new StudentRollComparator());
		TreeSet ts = new TreeSet<>(new StudentMarksComparator());
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		System.out.println(ts);
		
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		System.out.println("Highest Marks Student : "+getHighestMarksStudent(ts));
		System.out.println("Second Highest Marks Student : "+getSecondHighestMarksStudent(ts));
	}
	
	public static Student getHighestMarksStudent(TreeSet t)
	{
		Comparator cmp = t.comparator();
		if( cmp instanceof StudentMarksComparator)
			return (Student) t.last();
		else
			return null;
	}
	public static Student getSecondHighestMarksStudent(TreeSet t)
	{
		Comparator cmp = t.comparator();
		if( cmp instanceof StudentMarksComparator)
			return (Student) t.lower(t.last());
		else
			return null;
	}
	
}
