package com.prowings.collection.set.treesetexercise;

import java.util.Objects;

public class Car implements Comparable{
	
	String companyName;
	Integer yearOfMfg;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String companyName, int yearOfMfg) {
		super();
		this.companyName = companyName;
		this.yearOfMfg = yearOfMfg;
	}

	@Override
	public String toString() {
		return "Car [companyName=" + companyName + ", yearOfMfg=" + yearOfMfg + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Car otherCar = (Car) o;

		return this.companyName.compareTo(otherCar.companyName); //comapare by name
//		return this.yearOfMfg.compareTo(otherCar.yearOfMfg);
	}

}
