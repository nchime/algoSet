package com.chime.test;

/**
 * 
 * 
 * @author chkwak 2014. 8. 1. 오후 4:20:26
 */
public class arrayStarTest {

	public static void main(String[] args) {

		char[][] star = { { '*', ' ', ' ', ' ' }, { '*', '*', ' ', ' ' },
				{ '*', '*', '*', ' ' }, { '*', '*', '*', '*' } };

		char[][] newStar = star.clone();

		// 원본 출력
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {

				System.out.print(star[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("");
		// 복사본 출력
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				int x = j;
				int y = star.length - 1;
				newStar[x][y] = star[i][j];

			// 	System.out.print(newStar[x][y] + " ");
			}
			System.out.println("");
		}
		
		
		// 변형본 출력
		for (int i = 0; i < newStar.length; i++) {
			for (int j = 0; j < newStar[i].length; j++) {

				System.out.print(newStar[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
