package com.chime.algo;

/**
 * Bubble Sort 알고리즘
 * @author chkwak
 *
 */
public class BubbleSort {

	private int[] sortNum = null;

	public BubbleSort(int[] input) {

		this.sortNum = input.clone();
		setSortNum();

	}

	public int[] getSortNum() {
		return sortNum;
	}

	public void setSortNum() {

		int temp = 0;

		for (int i = 0; i < sortNum.length-1; i++) {

			for (int j = 0; j < sortNum.length-1-i; j++) {

				if (sortNum[j] > sortNum[j+1]) {
					temp = sortNum[j];
					sortNum[j] = sortNum[j+1];
					sortNum[j+1] = temp;
				}
			}
		}

		this.sortNum = sortNum;
	}

}
