package com.chime.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chime.algo.ConvertDigit;

public class ConvertDigitTest {

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
	public void testConvertNtoDigit() {

		ConvertDigit cd = new ConvertDigit();

		// n진수 10진수 변환
		System.out.println(cd.convertNtoDigit(2, 11111111));
		System.out.println(Long.parseLong("11111111", 2));

		// 10진수 16진수 변환
		System.out.println(cd.convertNtoDigit(16, 11111111));  
		System.out.println(Long.toHexString(10));
		


/*		assertEquals("Test 결과 : ", Long.parseLong("11111111", 2),
				cd.convertNtoDigit(2, 11111111));
*/
	}

}
