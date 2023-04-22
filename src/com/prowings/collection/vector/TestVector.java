package com.prowings.collection.vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("hello");
		al.add(20);
		System.out.println("ArrayList : " + al);
		LinkedList mylist = new LinkedList<>();

		mylist.add("AAA");
		mylist.add("BBB");
		System.out.println("LinkedList : " + mylist);

		Vector v = new Vector<>(al);

		v.addAll(mylist);
		
		System.out.println("Vector : "+v);
	}

}
