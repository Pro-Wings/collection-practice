package com.prowings.collection.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class TestVector2 {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(10);
		v.addElement("AAA");

		System.out.println("Vector : "+v);
		
		System.out.println(v.elementAt(3));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		v.setElementAt("XXX", 3);
		System.out.println("Vector after change : "+v);
		v.removeElementAt(3);
		System.out.println("Vector after removing : "+v);
		v.insertElementAt("ZZZ", 1);
		System.out.println("Vector after inserting : "+v);
		
		v.removeElement(10);
		System.out.println("Vector after removing : "+v);
		
		Object[] myArr = new Object[v.size()];
		
		v.copyInto(myArr);
		
		System.out.println("My Array  : "+ Arrays.toString(myArr));
	}

}
