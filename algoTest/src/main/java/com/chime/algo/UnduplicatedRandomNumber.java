package com.chime.algo;

import java.util.Random;

public class UnduplicatedRandomNumber {

	private int min;
	private int max;
	private int count;
	private int[] numbers;
	private int[] flag;

	public UnduplicatedRandomNumber(int min, int max, int count) {
		this.min = min;
		this.max = max;
		this.count = count;
		numbers = new int[this.count];
		flag = new int[max - min + 1];
	}

	public int[] query() {
		if (max < count)
			throw new RuntimeException("중복 되지 않는 난수를 " + count
					+ "개 만들어야 하는데, 난수 범위가(" + max + ") 이보다 작습니다.");
		Random random = new Random();
		int i = 0;
		do {
			int randomNum = random.nextInt(max) + min;
			if (flag[randomNum - 1] == 0) {
				flag[randomNum - 1] = 1;
				numbers[i++] = randomNum;
			}
		} while (i < count);
		return numbers;
	}

}
