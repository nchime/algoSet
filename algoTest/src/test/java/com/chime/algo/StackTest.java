package com.chime.algo;

import com.chime.algo.ArrayStack;

public class StackTest {

	public static void main(String[] args) {

		ArrayStack arrayStack = new ArrayStack(5);

		System.out.println("스택 테스트");

		for (int i = 0; i < arrayStack.getMaxSize(); i++) {
			arrayStack.push("ArrayStack Data " + i);
		}

		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		
		try {
			for (int i = 0; i < 10; i++) {
				arrayStack.push("ArrayStack Data " + i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println("==========");
		
	}

}
