package com.prowings.collection.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodLowerBoundWildcardDemo {
	
	
	public static void main(String[] args) {
		
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
 
        display(list1);
 
//        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
//        display(list2);
		
        List<Number> list3 = Arrays.asList(4.1, 5.1, 6.1);
        display(list3);
	}

	private static void display(List<? super Integer> list) //upper bound wildcharacter
    {
		
		System.out.println(list);
       
 
    }
	
	
	
}
