package com.chime.algo;

import java.text.SimpleDateFormat;

/**
 * 솟수 구하기 
 * @author chimeX430
 * 
 */
public class example3 {

	static int MAX_INT_NUM = 1000;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 시간 측정  
		elapsedTime();  

		// 솟수 구하기 
		calculateSotsu(MAX_INT_NUM);  

		// 시간 측정 
		elapsedTime();  


	}
	/**
	 * 입력값만큼 솟수 구하기 
	 * @param max_num
	 */
	private static void calculateSotsu(int max_num) {
		// 솟수 구하기 
		boolean flag = false;  
		for (int i = 2; i <= max_num; i++) {
			for (int j = 2; j <= i; j++) {
				if ((i % j == 0) && (i != j)) {
					flag = true; 
				} 
			}
			if(!flag) { 
				System.out.print(" " + i); 
			}
			flag = false; 
		}
		System.out.println(""); 		
	}
	/**
	 * 
	 */
	private static void elapsedTime() {
		// 측정 시작시간
		long startTime = System.currentTimeMillis(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS"); 
		String currentTime = sdf.format(startTime); 
		System.out.println(currentTime); 

	}
}