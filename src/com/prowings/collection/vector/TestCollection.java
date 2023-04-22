package com.prowings.collection.vector;

import java.util.Vector;

public class TestCollection {
	
	public static void main(String[] args) {
		
//		Vector v = new Vector(); //no-arg constructor - creates 10 size array
//		Vector v = new Vector(20); //one-arg constructor - creates specified initialCapacity size array
		Vector v = new Vector(5, 5); //one-arg constructor - 
		

		System.out.println("initial capacity : "+v.capacity());
		
		v.add(10);
		v.add(30);
		v.add(30);
		v.add(30);
		v.add(30);
		v.add(30);
		v.add(30);
		v.add(30);
		v.add(30);
		v.add(30);
		v.add(30);
		
		System.out.println("capacity after adding elements : "+v.capacity());
		System.out.println(v);
	}

}
