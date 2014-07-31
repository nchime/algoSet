package com.chime.algo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnduplicatedRandomNumberTest {

	private static final int MIN_RANGE = 1; // 랜덤하게 생성 되는 숫자의 범위의 최소값
	private static final int MAX_RANGE = 9; // 랜덤하게 생성 되는 숫자의 범위의 최대값
	private static final int RANDOM_COUNT = 3; // 생성할 난수의 갯수

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUnduplicatedRandomNumber() {
		UnduplicatedRandomNumber quiz = new UnduplicatedRandomNumber(MIN_RANGE,
				MAX_RANGE, RANDOM_COUNT);
		// Print
		for (int number : quiz.query()) {
			System.out.println(number);
		}
	}

}
