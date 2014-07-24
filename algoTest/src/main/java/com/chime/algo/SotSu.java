package com.chime.algo;

import java.util.ArrayList;

/**
 * 솟수 구하기
 * 
 * @author chimeX430
 * 
 */
public class SotSu {

	// static int MAX_INT_NUM = 1000;

	// private int[] sotSuNum = null;
	int k = 0;

	ArrayList<Integer> sotSuNum = new ArrayList<Integer>();

	public SotSu(int maxNum) {

		boolean flag = false;
		for (int i = 2; i <= maxNum; i++) {
			for (int j = 2; j <= i; j++) {
				if ((i % j == 0) && (i != j)) {
					flag = true;
				}
			}
			if (!flag) {
				sotSuNum.add(i);
			}
			flag = false;
		}

	}

	public ArrayList<Integer> getSotSuNum() {
		return sotSuNum;
	}

	public void setSotSuNum(ArrayList<Integer> sotSuNum) {
		this.sotSuNum = sotSuNum;
	}

}
