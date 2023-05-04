package com.prowings.collection.eqlshscode;

public class TestEqlHscode {
	
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(10, "Ram", "Pune");
		Employee emp2 = emp1;
		Employee emp3 = new Employee(20, "Sham", "Mumbai");
		
		
		System.out.println(emp1);
		System.out.println(emp2);

		System.out.println(emp1 == emp2);
		
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1.equals(emp3));
		
		System.out.println(emp3.hashCode());
	}
	

}
