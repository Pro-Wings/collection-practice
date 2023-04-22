package com.prowings.collection.vector;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		System.out.println(stack.empty());
		
		stack.push("BBB");
		stack.push("DDD");
		stack.push("CCC");
		stack.push("DDD");
		stack.push("AAA");
		stack.push("XXX");

		System.out.println(stack);
		
//		System.out.println(stack.pop());
//		System.out.println("stack after pop operation : "+stack);
		
//		System.out.println(stack.peek());
//		System.out.println("stack after peek operation : "+stack);
		
		System.out.println(stack.search("ZZZ"));
		
	}

}
