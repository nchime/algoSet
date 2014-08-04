package com.chime.test;

import java.util.HashMap;

public class CollectionTest {

	public static void main(String[] args) {

		String test = "한글abcdefghijklmnopqrstuvwxyz";
		System.out.println(test);

		
		// 직접 구현 
		for (int i = test.length()-1; i >=0; i--) {
//			System.out.print(i + " ");
			System.out.print(test.charAt(i));
		}
		
		System.out.println(); 
		// java 라이브러리 활용 
		
		System.out.print(new StringBuffer(test).reverse().toString()); 
		

	}

}
