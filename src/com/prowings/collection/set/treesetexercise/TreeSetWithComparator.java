package com.prowings.collection.set.treesetexercise;

import java.util.TreeSet;

public class TreeSetWithComparator {

	public static void main(String[] args) {

		Student std1 = new Student(10, "Ram", 50);
		Student std2 = new Student(04, "Sham", 70);
		Student std3 = new Student(12, "ZZZ", 35);

		TreeSet ts = new TreeSet<>(new StudentRollNoComparator());

		ts.add(std3);
		ts.add(std2);
		ts.add(std1);

		System.out.println(">>>>> by RollNo : " +ts);

		TreeSet ts1 = new TreeSet<>(new StudentNameComparator());
		
		ts1.add(std3);
		ts1.add(std2);
		ts1.add(std1);
		
		System.out.println(">>>>> by Name : " +ts1);

		TreeSet ts2 = new TreeSet<>(new StudentMarksComparator());
		
		ts2.add(std3);
		ts2.add(std2);
		ts2.add(std1);
		
		System.out.println(">>>>> by Marks : " +ts2);
		
		

	}

}
