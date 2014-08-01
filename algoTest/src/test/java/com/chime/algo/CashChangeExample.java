package com.chime.algo;

import java.util.Scanner;

/**
 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 500, 100, 50, 10 보유 잔돈 내에서 잔돈 지급
 * 로직 추가
 * 
 * @author chimeX430
 *
 */
public class CashChangeExample {

	public static void main(String[] args) {

		boolean enabled = true;

		Scanner inputMoney = new Scanner(System.in);

		System.out.println("금액을 입력하세요.. ");
		int money = inputMoney.nextInt();
		int totMoney = money;

		int coinKind[] = { 500, 100, 50, 10 };
		int coinKindCnt[] = { 0, 0, 0, 0 };
		int storeCoin[] = { 5, 10, 10, 10 }; // 보유한 단위별 동전 갯수.

		for (int i = 0; i < coinKind.length; i++) {
			if (money >= coinKind[i]) {

				coinKindCnt[i] = (int) (money / coinKind[i]);
				if (coinKindCnt[i] > storeCoin[i]) { // 만약 보유갯수보다 크게 나온다면
					money = (money % coinKind[i])
							+ (coinKind[i] * (coinKindCnt[i] - storeCoin[i]));
					coinKindCnt[i] = storeCoin[i];

				} else {
					money = money % coinKind[i];
				}

			}
			// System.out.println("money: >>>>>>>>>" + money);

			System.out.println(coinKind[i] + "원 : " + coinKindCnt[i]);
		}

		System.out.println("거스름돈 체크.. ");
		// 잔돈 총합 계산
		int maxChange = 0;

		for (int i = 0; i < storeCoin.length; i++) {
			maxChange += storeCoin[i] * coinKind[i];
		}
		System.out.println("보유 잔돈>>> " + maxChange + " 지급 급액 >>> " + totMoney
				+ " 잔여금액 >>> " + (maxChange - totMoney));

		if (maxChange < totMoney) { // 잔돈 총합보다 금액이 클때..
			enabled = false;
		}

		if (!enabled)
			System.out.println("거스름돈이 없습니다.");

	}

}
