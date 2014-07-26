package com.chime.algo;

public class SortTest {

	private static int[] testData = { 1, 5, 4, 3, 9, 3 };
	
	public static void main(String[] args) {
		

		int[] resultData_SelectionSort = null;
		int[] resultData_BubbleSort = null;		
		
		for (int i : testData) {
			System.out.print(" " + i);			
		}

		// Selection Sort 	
		SelectionSort sc = new SelectionSort(testData);
		resultData_SelectionSort = sc.getSortNum();
		

		System.out.println();
		
		for (int j : resultData_SelectionSort) {
			System.out.print(" " + j);			
		}

		// Bubble Sort 	
		BubbleSort bc = new BubbleSort(testData);
		resultData_BubbleSort = bc.getSortNum();
		

		System.out.println();
		
		for (int j : resultData_BubbleSort) {
			System.out.print(" " + j);			
		}

		
 

	}

}
