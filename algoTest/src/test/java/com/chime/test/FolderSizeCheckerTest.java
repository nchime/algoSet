package com.chime.test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FolderSizeCheckerTest {

	FolderSizeChecker fsc; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		fsc = new FolderSizeChecker(); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetFolderSize() {
	
		
		
		String fPath = "C:\\Users\\chkwak\\Downloads\\yobi-master\\yobi-master"; 
		long returnVal = 0; 
		
		returnVal = fsc.getFolderSize(fPath); 
		
		System.out.println(returnVal);
		System.out.println(fsc.readableFileSize(returnVal));
		
		
		assertThat(returnVal, notNullValue());
		

	}

}
