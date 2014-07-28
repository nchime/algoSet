package com.chime.algo;

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		ObjectArray oa = new ObjectArray(5);
		
		try {
			oa.add("test1");
			oa.add("test2");
			oa.add(2);
			oa.add(true);
			oa.add(true);
			oa.add(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
		}
		
		System.out.println(oa.toString());  
	}

}
