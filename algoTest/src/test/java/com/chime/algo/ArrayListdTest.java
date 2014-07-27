package com.chime.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListdTest {
	

	enum Week {월, 화, 수 }; 

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		HashMap hm = new HashMap(); 
		
		hm.put("key1", "value1"); 
		hm.put("key2", "value2"); 		
		hm.put("key3", "value3"); 		
		hm.put("key1", "value4"); 
		hm.put("key5", "value5"); 		
		hm.put("key6", "value6"); 			
		
		al.add("test1"); 
		al.add("test2"); 		
		al.add("test3"); 	
		
		
		al.add(1, "test000"); 
		al.add(hm);  
		
		
		System.out.println(al.indexOf("test3"));
		
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println( al.get(i) );
		} 
		
		System.out.println(hm.get("keu1"));		
		System.out.println(hm.get("keu2"));		
		System.out.println(hm.get("keu3"));				
		
		
		
		List<String> list = new ArrayList<String>(); 
		
		list.add("test1001"); 
		list.add("test1002"); 
		list.add("test1003"); 

		for (String str : list) {
			System.out.println(str);
		}

		for (Week day : Week.values()) {
			System.out.println(day + " 요일");
		}
		
		
		
		
	}

}
