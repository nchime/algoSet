package com.chime.algo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 임의의 지정된 값에 대해 중복되지 않는 숫자를 생성하는 방법, 단 첫째자리는 0이 아니어야 함
 * 
 * @author chimeX430
 *
 */
public class Example1 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			// 직접 구현한 로직..
			gernerator(9);
		}

		System.out.println("");
		
		// 다른 방법
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			al.add(i);
		}
		
		Collections.shuffle(al);
		
		for (Integer ret : al) {
			System.out.print(ret);
		}

	}

	private static void gernerator(int k) {
		int genVal[] = new int[k];

		for (int i = 0; i < k; i++) {
			genVal[i] = randVal(genVal, 10);
			System.out.print(genVal[i]);
		}

		System.out.println("");

	}

	/**
	 * 
	 * 특정 값이 없는 난수 직접 생성
	 * 
	 * @param genVal
	 * @param i
	 * @return
	 */
	private static int randVal(int[] genVal, int i) {

		int genNum = (int) (Math.random() * i);
		boolean checker = true;

		for (int j = 0; j < genVal.length; j++) {
			if (genNum == genVal[j])
				checker = false;
		}

		if (checker)
			return genNum;
		else
			return randVal(genVal, i);
	}

}
