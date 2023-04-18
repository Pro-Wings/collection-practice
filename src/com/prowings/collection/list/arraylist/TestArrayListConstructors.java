package com.prowings.collection.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestArrayListConstructors {
	
	public static void main(String[] args) throws Exception {
		
		
//		ArrayList al = new ArrayList(); //no-arg - creates 10 capacity array
		ArrayList al = new ArrayList(20); //1 arg - creates array with specified capacity
		
		al.add("hello");
		al.add(20);
		al.add("hello");
		al.add("hi");
		al.add(10);
		al.add(30);
		
		
		System.out.println("initial capacity : "+getCapacity(al));
		System.out.println("size : "+al.size());

		System.out.println(al);
		
		
		ArrayList al2 = new ArrayList(al); //1 arg constructor which accepts another collection
		
//		ArrayList al2 = new ArrayList(20);
		
		al2.addAll(al);
		
		System.out.println("AL2 : "+al2);
//		al2.add(123);
		System.out.println("initial capacity : "+getCapacity(al2));
		System.out.println("size : "+al2.size());

	}

	
    public static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
	
}
