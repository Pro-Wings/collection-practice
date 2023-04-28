package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetDemo5 {

	public static void main(String[] args) {

		Employee2 emp1 = new Employee2(10, "AAA");
		Employee2 emp2 = new Employee2(20, "BBB");
		Employee2 emp3 = new Employee2(30, "CCC");
		Employee2 emp4 = new Employee2(30, "CCC");
		//sort Emp by name
		
		TreeSet ts = new TreeSet();

		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp1);
		ts.add(emp4);

		System.out.println(ts);
	}

}
