package com.chime.algo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 진법 변환 알고리즘
 * http://cafe.naver.com/jobstartgogo/24440 참고..
 * 
 * @author chkwak 2014. 8. 8. 오후 1:12:27
 */
public class ConvertDigit {

	/**
	 * N진수를 10진수로 변경
	 * 
	 * @param nJinsu
	 * @param inputNum
	 * @return
	 */
	public int convertNtoDigit(int nJinsu, int inputNum) {

		String inputNumStr = String.valueOf(inputNum);
		int ten = 0;

		for (int i = 0; i < inputNumStr.length(); i++) {
			int digit = inputNumStr.charAt(i) - '0';

			if (digit > 9) {
				digit = inputNumStr.charAt(i) + 10 - 'A';
			}

			ten += (int) Math.pow((double) nJinsu,
					(double) (inputNumStr.length() - i - 1))
					* digit;
		}
		return ten;

	}

	
	/**
	 * 10진수를 N진수로 변경 
	 * 
	 * @param inputNum
	 * @param nJinsu
	 * @return
	 */
	public String convertDigitToN(int inputNum, int nJinsu) {
		// TODO 수정할 것.. 
		
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		
		
		while(inputNum > 0) { 
			
			inputNum = inputNum / nJinsu; 
			al.add(inputNum % nJinsu); 
		}
		
		 Collections.reverse(al);
		
		
		return al.toString();
	}
	
	
}
