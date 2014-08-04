package com.chime.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {

		int test[] = {6,5,4,3,2,1, 5,32,234234,234,-213}; 
		
	
//		List<int[]> list = Arrays.asList(test); 
		
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		
		for (int i = 0; i < test.length; i++) {
			al.add(test[i]); 
		}

		
		// 리스트에 담아서 정리 
		Collections.sort(al);
		
		for (Integer integer : al) {
			System.out.print(integer + " ");
		}
		
		System.out.println(" ");
		
		Collections.reverse(al);

		
		
		
		
		for (Integer integer : al) {
			System.out.print(integer + " ");
		}
		

		
		
		
	}

}
