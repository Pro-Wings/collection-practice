package com.prowings.collection.set.treesetexercise;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(new String("XXX"));
		ts.add(null);
		
		Iterator itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
