package com.chime.algo;

/**
 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 500, 100, 50, 10
 * 
 * @author chimeX430
 *
 */
public class CashChangeExample {

	public static void main(String[] args) {

		int money = 900;

		int coinKind[] = { 500, 100, 50, 10};
		int coinKindCnt[] = { 0, 0, 0, 0 };

		for (int i = 0; i < coinKind.length; i++) {
			if (money > coinKind[i]) {
				coinKindCnt[i] = (int) (money / coinKind[i]);
				money = money % coinKind[i];
			}
		}

		for (int i = 0; i < coinKind.length; i++) {
			System.out.println(coinKind[i] + "원 :  " + coinKindCnt[i]);			
		}

	}

}
