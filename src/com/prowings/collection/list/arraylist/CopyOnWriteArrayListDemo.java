package com.prowings.collection.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) throws Exception {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		
		System.out.println("initial capacity : "+getCapacity(list));
		
		list.add("AAA");
		list.add("BBB");
		list.add(null);
		list.add("AAA");
		System.out.println("capacity after adding elements : "+getCapacity(list));
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			list.add("zzz"); //do not thorws ConcurrentModificationException
//			itr.remove();  // iterator's remove method throws UnsupportedOperationException

		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ListIterator<String> ltr = list.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			list.add("zzz"); //do not thorws ConcurrentModificationException
			ltr.remove();  // iterator's remove method throws UnsupportedOperationException
		}

		
	}

	
    public static int getCapacity(CopyOnWriteArrayList<String> list) throws Exception {
        Field dataField = CopyOnWriteArrayList.class.getDeclaredField("array");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(list)).length;
    }

	
}
