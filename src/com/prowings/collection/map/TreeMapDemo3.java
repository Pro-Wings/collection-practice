package com.prowings.collection.map;

import java.util.TreeMap;

public class TreeMapDemo3 {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(1234, "Honda");
		Car c2 = new Car(007, "Audi");
		Car c3 = new Car(998, "BMW");
		Car c4 = new Car(007, "Audi");

		
		TreeMap<Car, Integer> tmap = new TreeMap<>();
		
		tmap.put(c1, 11111);
		tmap.put(c2, 22222);
		tmap.put(c3, 33333);
		tmap.put(c4, 44444);
		
		System.out.println(tmap);
		
	}

}
