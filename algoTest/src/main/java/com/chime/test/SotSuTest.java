package com.chime.test;

import java.util.ArrayList;

import com.chime.algo.SotSu;



/**
 * 지정된 값에 대한 솟수 구하기 
 * 
 * @author chkwak
 *
 */
public class SotSuTest {
	
	
	public static  int MaxNum = 100;  

	public static void main(String[] args) {
		
		SotSu ss = new SotSu(MaxNum);
		
		ArrayList<Integer> resultData = ss.getSotSuNum();
		
		
		for (int i : resultData) {
			System.out.print(" " + i);
		}
		
		
		

	}

}
