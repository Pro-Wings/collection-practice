package com.prowings.collection.set;

import java.util.Objects;

public class Employee implements Comparable{
	
	int id;
	String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
	@Override
	public int compareTo(Object o) { //comparable - by id comparision
		Employee other = (Employee) o;
		
		if(this.id == other.id)
			return 0;
		else if(this.id > other.id)
			return -1;
		else
			return 2;
		
	}
	
	

}
