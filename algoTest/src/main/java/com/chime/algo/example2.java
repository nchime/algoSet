package com.chime.algo;

public class example2 {

	public static void main(String[] args) {

		int testData[] = { 1, 5, 4, 3, 9, 3 };

		int result[] = new int[testData.length];

		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + testData[i]);
		}

		System.out.println("\nBubble Sort :  ");

		result = bubbleSort(testData);
		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}

		System.out.println("\nSelection  Sort :  ");
		result = selectionSort(testData);
		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}

	}

	/**
	 * @param input
	 * @return 알고리즘 : Selection 정렬
	 */
	public static int[] selectionSort(int input[]) {

		int temp = 0;

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}

	/**
	 * @param input
	 * @return 알고리즘 : 버블 정렬
	 */
	public static int[] bubbleSort(int input[]) {

		int temp = 0;

		for (int i = 0; i < input.length; i++) {

			for (int j = i; j < input.length; j++) {

				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}

		return input;

	}

}
