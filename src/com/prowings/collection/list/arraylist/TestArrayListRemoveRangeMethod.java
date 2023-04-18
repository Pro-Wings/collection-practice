package com.prowings.collection.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestArrayListRemoveRangeMethod extends ArrayList{
	
	public static void main(String[] args) throws Exception {
		
		
		TestArrayListRemoveRangeMethod lst = new TestArrayListRemoveRangeMethod();
		
		lst.add("A");//0
		lst.add("B");//1
		lst.add("C");//2
		lst.add("D");//3
		lst.add("E");//4
		lst.add("F");//5
		
		System.out.println(lst);
		
		System.out.println("removing elements with range");
		
		lst.removeRange(1,3);

		System.out.println(lst);

	}
	
}
