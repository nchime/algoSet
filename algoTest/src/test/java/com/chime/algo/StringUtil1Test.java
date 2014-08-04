package com.chime.algo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringUtil1Test {
	

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
	public void testTransSpaceNbsp() {
		
		StringUtil1 util = new StringUtil1();
		
		
		assertEquals("string parsing test for Using HTML",
                "a b  c   d",
                util.transSpaceNbsp("a b  c   d") );
		
		System.out.println( util.transSpaceNbsp("a b  c   d") );
		
		
	}

}
