package com.prowings.collection.set;

public class Student {

	int roll;
	String name;
	int marks;

	public Student() {
		super();
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, roll);
//	}

	// @Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && roll == other.roll;
//	}

//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//
//		boolean res = false;
//		Student other = (Student) obj;
//
//		if ((this.roll == other.roll) && (this.name.equals(other.name)))
//			res = true;
//		return res;
//	}
//
//	public int hashCode() {
//
//		int result = 0;
//
//		result = 31 * (this.roll + this.name.hashCode());
//		return result;
//	}

}
