package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("AAA");
		StringBuffer s2 = new StringBuffer("BBB");
		StringBuffer s3 = new StringBuffer("CCC");
		
		TreeSet ts = new TreeSet();

		ts.add(s2);
		ts.add(s3);
		ts.add(s1);

		System.out.println(ts);
	}

}
