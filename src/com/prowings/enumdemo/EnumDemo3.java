package com.prowings.enumdemo;

enum PizzaSize implements I
{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
	
	PizzaSize()
	{
		System.out.println("constructor invoked!!");
	}
	
	int val = 10;
	
	public void getVal()
	{
		System.out.println("inside getVal()");
		System.out.println("val is : "+ val);
	}
	
	public void m1()
	{
		System.out.println("inside m1()");
	}
}


public class EnumDemo3 {
	
	public static void main(String[] args) {
		
		Values pizzaSize = Values.SMALL;
		
		System.out.println(pizzaSize);
		
		pizzaSize.getVal();
		
		System.out.println(pizzaSize.val);
		
		System.out.println(pizzaSize.ordinal()); // ordinal method gives the position of constant from enum - where position index starts from 0.
		
	}


}
