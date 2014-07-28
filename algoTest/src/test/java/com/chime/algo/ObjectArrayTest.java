package com.chime.algo;

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		ObjectArray oa = new ObjectArray(-1);
		
		oa.add("test1");
		oa.add("test2");		
		oa.add("test3");
		oa.remove("test2");
		
		System.out.println(oa.toString()); 
		
	}

}
