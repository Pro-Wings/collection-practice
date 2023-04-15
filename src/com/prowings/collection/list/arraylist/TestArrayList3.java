package com.prowings.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList3 {
	
	public static void main(String[] args) throws Exception {
		
		
		ArrayList al = new ArrayList();
		
		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(40);
		al.add("hi");
		al.add("hello");

		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			if(itr.next().equals(40))
			al.set(0, "Helllooo"); //replaced element
//			al.add(50);
//			al.remove(1);
//			if(itr.next().equals(40))
//			itr.remove();
		}
		
		System.out.println(al);

	}

}
