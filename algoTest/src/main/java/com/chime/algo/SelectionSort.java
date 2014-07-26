package com.chime.algo;

/**
 * 
 * Selection Sort 알고리즘
 * 
 * @author chkwak
 *
 */
public class SelectionSort {

	private int[] sortNum = null;

	public SelectionSort(int[] input) {
		
		/*  배열변수에 배열변수를 넘기면 두 값은 항상 동일한 값으로 유지된다.
		 *  띠라서, 배열 복사는 clone(), arraycopy() 메소드로 실제 데이터 단위로 복사하자.. */
		this.sortNum = input.clone(); 
		setSortNum(this.sortNum); 

	}
	
	public int[] getSortNum() {
		return sortNum;
	}

	public void setSortNum(int[] sortNum) {
		
		int temp = 0;

		for (int i = 0; i < sortNum.length; i++) {

			for (int j = i + 1; j < sortNum.length; j++) {

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
