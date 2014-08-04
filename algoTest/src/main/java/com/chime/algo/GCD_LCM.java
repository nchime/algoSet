package com.chime.algo;

/**
 * 최소공배수(LCM), 최대공약수(GCD) 알고리즘  
 * @author chkwak
 *
 */
public class GCD_LCM {

	/**
	 * 최소공배수 : 두 수를 곱한 값을 최대공약수로 나눈다.
	 * @param i
	 * @param j
	 * @return 
	 */
	public int getLCMAlgo1(int i, int j) {

		return (i * j) / getGCDAlgo1(i, j);
	}

	/**
	 * 최대공약수 알고리즘1 : 두 수를 비교하여 두 수가 일치할때까지 큰 수에서 작은 수를 뺀 값으로 반복 대입한다.
	 * @param i
	 * @param j
	 * @return
	 * 
	 */
	public int getGCDAlgo1(int i, int j) {

		int a = i, b = j;

		
		// a= 24. , b = 12
		while (a != b) {
			if (a > b)
				a = a - b;
			if (b > a)
				b = b - a;
		}

		return a;
	}

	/**
	 * 최대공약수 알고리즘 2 :
	 * @param i
	 * @param j
	 * @return
	 */
	public int getGCDAlgo2(int i, int j) {
		while (j != 0) {
			int temp = i % j;
			i = j;
			j = temp;
		}
		return Math.abs(i);

	}

}
