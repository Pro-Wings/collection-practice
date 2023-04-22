package com.prowings.collection.vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestVectorCursors {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(10);
		v.addElement("AAA");

		System.out.println("Vector : "+v);
		
		
		iterateUsingIterator(v);
		iterateUsingListIterator(v);
		iterateUsingEnumeration(v);
	}

	private static void iterateUsingEnumeration(Vector v) {
		
		System.out.println("iterating using Enumeration - started!!");
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
//			v.add("ZZZ"); //fail-safe -as does not throw concurrent modification exception even after structural modification
		}
		System.out.println("iterating using Enumeration - ended!!");
		
	}

	private static void iterateUsingListIterator(Vector v) {
		
		System.out.println("iterating using ListIterator - started!!");
		ListIterator ltr = v.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("iterating using ListIterator - ended!!");
	}

	private static void iterateUsingIterator(Vector v) {

		System.out.println("iterating using Iterator - started!!");
		Iterator itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("iterating using Iterator - ended!!");
	}

}
