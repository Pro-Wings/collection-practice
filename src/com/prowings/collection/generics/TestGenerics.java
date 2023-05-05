package com.prowings.collection.generics;

public class TestGenerics {
	
	public static void main(String[] args) {
		
		
		Box<String> b1 = new Box<>();
		
		b1.setItem("helloooo!!");
		
		System.out.println(b1.getItem());
		
		
		Box<Integer> b2 = new Box<>();
		
		b2.setItem(1234);
		System.out.println(b2.getItem());
		
//		Box<int> b3 = new Box<>(); //CE - as generic dont work for primitives 
		
		Pair<String, Integer> pair = new Pair<>();
		
		pair.setKey("aaa");
		pair.setValue(123);
		
		System.out.println(pair.getKey() +"   "+ pair.getValue());
	}

}
