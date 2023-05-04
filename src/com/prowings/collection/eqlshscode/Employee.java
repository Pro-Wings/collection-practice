package com.prowings.collection.eqlshscode;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(address, id, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	

}
