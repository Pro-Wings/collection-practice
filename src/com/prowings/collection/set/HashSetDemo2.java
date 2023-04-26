package com.prowings.collection.set;

import java.util.HashSet;

public class HashSetDemo2 {
	
	
	public static void main(String[] args) {
		

		Student std1 = new Student(10, "Ram");
		Student std2 = new Student(20, "Sham");
		Student std3 = new Student(10, "Ram");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std3.hashCode());
		
		HashSet hs = new HashSet<>();
		
		System.out.println(hs.add(std1));
		System.out.println(hs.add(std2));
		System.out.println(hs.add(std3));
		
		System.out.println(hs);
	}

}
