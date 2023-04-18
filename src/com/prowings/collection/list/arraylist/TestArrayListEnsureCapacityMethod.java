package com.prowings.collection.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestArrayListEnsureCapacityMethod {
	
	public static void main(String[] args) throws Exception {
		
		
		ArrayList al = new ArrayList(); //no-arg - creates 10 capacity array
		
		al.add("hello");
		al.add(20);
		al.add("hello");
		al.add("hi");
		al.add(10);
		al.add(30);
		
		
		al.ensureCapacity(20);
		
		System.out.println("initial capacity : "+getCapacity(al));
		System.out.println("size : "+al.size());

		System.out.println(al);
		
	}

	
    public static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
	
}
