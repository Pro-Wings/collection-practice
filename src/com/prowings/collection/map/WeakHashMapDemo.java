package com.prowings.collection.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(1234, "Honda");
		Car c2 = new Car(007, "Audi");
		Car c3 = new Car(998, "BMW");
		

		WeakHashMap<Car, Integer> wmap = new WeakHashMap<>();
//		HashMap<Car, Integer> wmap = new HashMap<>();
		
		wmap.put(c1, 11111);
		wmap.put(c2, 22222);
		wmap.put(c3, 33333);
		
		System.out.println("before GC : "+wmap);

		c1 = null;
		
		System.gc();

		System.out.println("after GC : "+wmap);
		
	}

}
