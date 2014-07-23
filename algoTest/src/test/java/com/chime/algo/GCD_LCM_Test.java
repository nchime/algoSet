package com.chime.algo;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GCD_LCM_Test {

	private static final Logger logger = LoggerFactory
			.getLogger(GCD_LCM_Test.class);
	


	public static void main(String[] args) {

		GCD_LCM gl = new GCD_LCM(); 
		int inputVal1 = 0; 
		int inputVal2 = 0;
		
/*		// 두 수 입력 받는 루틴 
		Scanner in = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.. ");
		
		inputVal1 = in.nextInt();  
		inputVal2 = in.nextInt();
*/		
		
		// 일정 범위의 난수 정수값 받는 루틴 
		inputVal1 = (int) (Math.random() * 100);  
		inputVal2 = (int) (Math.random() * 100);		
		

		logger.info(inputVal1 + " " + inputVal2 + " 에 대한.. ");

		int gcd = gl.getGCDAlgo2(inputVal1, inputVal2);
		logger.info("최대공약수 : " + gcd);

		int lcm = gl.getLCMAlgo1(inputVal1, inputVal2);
		logger.info("최소공배수 : " + lcm);

	}

}
