package com.prowings.collection.set;

import java.util.Objects;

public class Employee2 implements Comparable{
	
	int id;
	String name;

	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee2(int id, String name) {
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
//		Employee2 other = (Employee2) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
	@Override
	public int compareTo(Object o) { //comparable - by name comparision
		Employee2 other = (Employee2) o;

		int res = this.name.compareTo(other.name);
		return res;
	}
	
	

}
