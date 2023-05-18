package com.prowings.collection.map;

import java.util.EnumMap;
import java.util.Iterator;

enum Size
{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
	
	Size()
	{
		System.out.println("constructor invoked!!");
	}
}



public class EnumMapDemo {
	
	public static void main(String[] args) {
		
		EnumMap<Size, Integer> mymap = new EnumMap<>(Size.class);
		
		mymap.put(Size.EXTRALARGE, 80);
		mymap.put(Size.LARGE, 60);
		mymap.put(Size.SMALL, 40);
		mymap.put(Size.MEDIUM, 50);
		mymap.put(Size.SMALL, 100);
		mymap.put(Size.SMALL, null);
//		mymap.put(null, 100);
//		mymap.put(Days.FRIDAY, 50); //EnumMap accepts only same type enum keys!!
		
		Iterator<Size> itr = mymap.keySet().iterator();
		
		while(itr.hasNext())
		{
			Size k = itr.next();
			System.out.println("Key : "+k + " and " +"Value : "+mymap.get(k));
		}
	}

}
