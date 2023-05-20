package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSingltonListDemo {
	
	
	public static void main(String[] args) {
		
		String initList[] = { "One", "Two", "Four", "One",};

        // create one list
        List list = new ArrayList(Arrays.asList(initList));

        System.out.println("List value before: "+list);

        // create singleton list
        list = Collections.singletonList("OnlyOneElement");
        System.out.println("List value after: "+list);		
        list.add("five"); //throws UnsupportedOperationException
        System.out.println("List value after: "+list);		
	}

}
