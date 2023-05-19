package com.prowings.collections;

public class Person /* implements Comparable<Person> */{
	
	int id;
	String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
//	@Override
//	public int compareTo(Person o) {
//		
//		if(this.id == o.id)
//			return 0;
//		else if(this.id > o.id)
//			return 4;
//		else
//			return -3;
//		
//	}
	
	

}
