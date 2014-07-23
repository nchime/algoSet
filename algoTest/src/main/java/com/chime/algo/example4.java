package com.chime.algo;

import java.util.Scanner;

public class example4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int maxInt = sc.nextInt();

		System.out.println(maxInt + " 까지의 솟수는.. ");
		System.out.println("");

		long start = System.currentTimeMillis();
		getSosu1(maxInt);
		long end = System.currentTimeMillis();

		System.out.println();
		System.out.println("수행시간 : " + (end - start));

	}

	private static void getChecker(Object sosu1) {

		long start = System.currentTimeMillis();

		long end = System.currentTimeMillis();
	}

	private static void getSosu1(int maxInt) {

		boolean cPrime = false;

		for (int i = 2; i <= maxInt; i++) {

			for (int j = 2; j < i; j++) {
				if ((i % j == 0) && (i != j)) {
					cPrime = true;
					break;
				}
			}
			if (!cPrime)
				System.out.print(" " + i); // 솟수 확정..
			cPrime = false;
		}
	}

}
