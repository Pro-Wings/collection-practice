package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		String s1 = "AAA";
		StringBuffer s2 = new StringBuffer("BBB");
		StringBuilder s3 = new StringBuilder("CCC");
		
		TreeSet ts = new TreeSet();

		ts.add(s2);
		ts.add(s3);
		ts.add(s1);

		System.out.println(ts);
	}

}
