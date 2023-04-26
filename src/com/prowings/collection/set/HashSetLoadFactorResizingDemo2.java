package com.prowings.collection.set;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetLoadFactorResizingDemo2 {

	public static void main(String[] args) {
		{

			String s1 = "FB";
			String s2 = "Ea";
			String s3 = "CCC";
			String s4 = "DDD";
			String s5 = "EEE";
			String s6 = "FFF";
			String s7 = "GGG";
			String s8 = "HHH";
			String s9 = "III";
			String s10 = "JJJ";
			String s11 = "KKK";
			String s12 = "LLL";
			String s13 = "MMM";

			HashSet hs = new HashSet();

			System.out.println(hs.add(s1));
			System.out.println(hs.add(s2));
			System.out.println(hs.add(s3));
			System.out.println(hs.add(s4));
			System.out.println(hs.add(s5));
			System.out.println(hs.add(s6));
			System.out.println(hs.add(s7));
			System.out.println(hs.add(s8));
			System.out.println(hs.add(s9));
			System.out.println(hs.add(s10));
			System.out.println(hs.add(s11));
			System.out.println(hs.add(s12));
			System.out.println(hs.add(s13));

			System.out.println(hs);

		}
	}

}
