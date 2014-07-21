package com.chime.algo;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class example1 {

	private static final Logger logger = LoggerFactory
			.getLogger(example1.class);

	public static void main(String[] args) {

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

		int gcd = getGCDAlgo2(inputVal1, inputVal2);
		logger.info("최대공약수 : " + gcd);

		int lcm = getLCMAlgo1(inputVal1, inputVal2);
		logger.info("최소공배수 : " + lcm);

	}

	/**
	 * @param i
	 * @param j
	 * @return 
	 * 알고리즘 : 최소공배수 : 두 수를 곱한 값을 최대공약수로 나눈다.
	 */
	private static int getLCMAlgo1(int i, int j) {

		return (i * j) / getGCDAlgo1(i, j);
	}

	/**
	 * 최대공약수 알고리즘1 : 두 수를 비교하여 두 수가 일치할때까지 큰 수에서 작은 수를 뺀 값으로 반복 대입한다.
	 * @param i
	 * @param j
	 * @return 
	 *  
	 */
	private static int getGCDAlgo1(int i, int j) {

		int a = i, b = j;

		while (a != b) {
			if (a > b)
				a = a - b;
			if (b > a)
				b = b - a;
		}

		return a;
	}
	
	
	
	/**
	 * 최대공약수  알고리즘 2 :  
	 * @param i
	 * @param j
	 * @return
	 */
	private static int getGCDAlgo2(int i, int j) {
		while(j != 0 ) { 
			int temp = i % j; 
			i = j; 
			j = temp; 
		}
		return Math.abs(i);
		
	}

}
