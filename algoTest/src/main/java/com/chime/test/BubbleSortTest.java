package com.chime.test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chime.algo.BubbleSort;

public class BubbleSortTest {

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
	public void testBubbleSort() {

		int input[] = { 4, 6, 3, 22, 89, 10, 1 };

		BubbleSort bs = new BubbleSort(input);

		for (int i : input) {
			System.out.print(i + " ");
		}

		System.out.println();

		bs.setSortNum();

		int result[] = bs.getSortNum();

		for (int i : result) {
			System.out.print(i + " ");
		}
		
		assertThat(result, notNullValue());

	}

}
