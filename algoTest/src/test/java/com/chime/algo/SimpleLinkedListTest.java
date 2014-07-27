package com.chime.algo;

public class SimpleLinkedListTest {

	public static void main(String[] args) {
		SimpleLinkedList sll = new SimpleLinkedList();
		
		sll.add("test1");
		sll.add("test2");		
		sll.add("test3");
		sll.add("test4");
		sll.add("test5");
		sll.add("test6");
		sll.remove(0); 
		sll.remove(0); 
		sll.remove(0); 
		

		System.out.println(sll.toString());
		
	}

}
