package com.chime.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
 * 
 * @author chkwak 2014. 7. 29. 오후 5:13:24
 */
public class CodingTest {

	public static void main(String[] args) {

		int arr2[][] = { { 1, 9 }, { 1, 9 }, { 1, 9 } };
		int sum = 0; 
		float avg = 0f; 

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum += arr2[i][j];
			}
		}
		
		avg = sum / (arr2.length * arr2[0].length); 

		System.out.println("Sum :" + sum);
		System.out.println("Avg :" + avg);
	}

}
