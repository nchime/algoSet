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
		setSortNum(this.sortNum);

	}

	public int[] getSortNum() {
		return sortNum;
	}

	public void setSortNum(int[] sortNum) {

		int temp = 0;

		for (int i = 0; i < sortNum.length; i++) {

			for (int j = i; j < sortNum.length; j++) {

				if (sortNum[i] > sortNum[j]) {
					temp = sortNum[i];
					sortNum[i] = sortNum[j];
					sortNum[j] = temp;
				}
			}
		}

		this.sortNum = sortNum;
	}

}
