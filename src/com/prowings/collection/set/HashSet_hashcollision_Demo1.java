package com.prowings.collection.set;

import java.util.HashMap;
import java.util.HashSet;

public class HashSet_hashcollision_Demo1 {
	
	public static void main(String[] args) {
		
		String s1 = "FB";

        String s2 = "Ea";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.hashCode() == s2.hashCode()); // true

        HashSet<String> hs = new HashSet();

        hs.add(s1);
        hs.add(s2);

        System.out.println(hs);
	}

}
