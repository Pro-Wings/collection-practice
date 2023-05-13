package com.prowings.collection.map;

import java.util.TreeMap;

public class TreeMapDemoUsingCustomComparator {
	
	public static void main(String[] args) {
		
		Bike c1 = new Bike(1234, "Honda");
		Bike c3 = new Bike(998, "Bmw");
		Bike c4 = new Bike(007, "Bajaj");

		
		System.out.println("sorting by model : ");
		
		TreeMap<Bike, Integer> tmap = new TreeMap<>(new BikeModelComparator());
		
		tmap.put(c1, 11111);
		tmap.put(c3, 33333);
		tmap.put(c4, 44444);
		
		System.out.println(tmap);

		System.out.println("sorting by company : ");
		
		TreeMap<Bike, Integer> tmap2 = new TreeMap<>(new BikeCompanyComparator());
		
		tmap2.put(c1, 11111);
		tmap2.put(c3, 33333);
		tmap2.put(c4, 44444);
		
		System.out.println(tmap2);
		
	}

}
