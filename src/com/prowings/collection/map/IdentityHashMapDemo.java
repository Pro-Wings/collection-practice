package com.prowings.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(1234, "Honda");
		Car c2 = new Car(007, "Audi");
		Car c3 = new Car(998, "BMW");
		Car c4 = new Car(007, "Audi");
		Car c5 = c3;
		
		HashMap<Car, Integer> map = new HashMap<>();
		
		map.put(c1, 11111);
		map.put(c2, 22222);
		map.put(c4, 44444);
		map.put(c3, 33333);
		
		System.out.println(map);
		
		System.out.println("===================================");
		
		
		IdentityHashMap<Car, Integer> iMap = new IdentityHashMap<>();
		iMap.put(c1, 11111);
		iMap.put(c2, 22222);
		iMap.put(c4, 44444);
		iMap.put(c3, 33333);
		iMap.put(c5, 55555);
		
		System.out.println(iMap);
		
		
	}

}
