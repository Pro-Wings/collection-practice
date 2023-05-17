package com.prowings.enumdemo;

enum Size
{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
	
	Size()
	{
		System.out.println("constructor invoked!!");
	}
}


public class EnumDemo {
	
	public static void main(String[] args) {

		
		//String -to- Enum constant
		String s = "MEDIUM";
		Size pizzaSize = Size.valueOf(s);
		System.out.println(pizzaSize);
		orderPizza(pizzaSize);
		
		//Enum constant -to- String
		Size sz = Size.EXTRALARGE;
		String size2 = sz.toString();
		System.out.println("enum constant in string  : "+size2);
		
	}

	private static void orderPizza(Size pizzaSize) {
		switch(pizzaSize)
		{
	     case SMALL:
	         System.out.println("I ordered a small size pizza.");
	         break;
	       case MEDIUM:
	         System.out.println("I ordered a medium size pizza.");
	         break;
	       case LARGE:
	    	   System.out.println("I ordered a large size pizza.");
	    	   break;
	       case EXTRALARGE:
	    	   System.out.println("I ordered a extra large size pizza.");
	    	   break;
	       default:
	         System.out.println("I don't know which one to order.");
	         break;		
		}
	}

}
