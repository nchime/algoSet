package com.chime.algo;

/**
 * 
 * @author chimeX430
 *
 */
public class Example1 {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			gernerator(7);
		}
	}

	private static void gernerator(int k) {
		int tempVal[] = new int[k];

		int temp = 0;
		String ret = "";

		for (int i = 0; i < k; i++) {
			temp = (int) (Math.random() * 10);

			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (tempVal[j] == temp) {
						temp = (int) (Math.random() * 10);
						j = 0;
					}
				}
			} else {
				if (temp == 0) {
					temp = (int) (Math.random() * 10);
					i = 0;
				}

			}
			tempVal[i] = temp;

			ret += String.valueOf(tempVal[i]);
		}

		System.out.print(Integer.parseInt(ret));
		System.out.println("");

	}

}
