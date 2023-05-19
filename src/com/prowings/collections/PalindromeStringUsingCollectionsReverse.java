package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeStringUsingCollectionsReverse {

	public static void main(String[] args) {
		
		String input = "RADAR";
		
		char[] chars = input.toCharArray();
		
		ArrayList<Character> characters = new ArrayList<>();
		
		for(char c : chars)
		{
			characters.add(c);
		}
		
		Collections.reverse(characters);
		
		String reversed = characters.toString().replaceAll("\\[|\\]", "").replaceAll(", ","");
		
		if(input.equals(reversed))
			System.out.println("Palindrome!!");
		else
			System.out.println("Not Palindrome!!");
		

	}
	
}
