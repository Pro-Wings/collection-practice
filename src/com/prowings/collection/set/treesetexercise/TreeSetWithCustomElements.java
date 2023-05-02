package com.prowings.collection.set.treesetexercise;

import java.util.TreeSet;

public class TreeSetWithCustomElements {
	
	public static void main(String[] args) {
	
		Car c1 = new Car("Honda", 1999);
		Car c2 = new Car("Audi", 2004);
		Car c5 = new Car("AAA", 2004);
		Car c4 = new Car("AAB", 2004);
		Car c3 = new Car("Jaguar", 2011);
		
		TreeSet myts = new TreeSet<>();
		
		myts.add(c3);
		myts.add(c5);
		myts.add(c4);
		myts.add(c1);
		myts.add(c2);

		System.out.println(myts);
	}

}
