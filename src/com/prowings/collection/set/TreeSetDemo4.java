package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "AAA");
		Employee emp2 = new Employee(20, "BBB");
		Employee emp3 = new Employee(30, "CCC");
		Employee emp4 = new Employee(30, "CCC");
		//sort Emp by id
		
		TreeSet ts = new TreeSet();

		ts.add(emp4);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp1);

		System.out.println(ts);
	}

}
