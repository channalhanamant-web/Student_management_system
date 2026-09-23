package com.collections.List;

import java.util.Stack;

public class ReverseStringUsingStackDemo {

	public static void main(String[] args) {
		String inputString = "Hello";
		char inputArray[] = inputString.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : inputArray) {
			stack.push(c);
		}
		StringBuilder sB=new StringBuilder();
		while (!stack.isEmpty()) {
			sB.append(stack.pop());
		}
		System.out.println(sB.toString());
	}

}
