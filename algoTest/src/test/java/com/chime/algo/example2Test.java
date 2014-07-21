package com.chime.algo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author chkwak
 *
assertArrayEquals(a, b);	배열 A와 B가 일치함을 확인한다.
assertEquals(a, b);	객체 A와 B가 일치함을 확인한다.
assertSame(a, b);	객체 A와 B가 같은 객임을 확인한다. assertEquals 메서드는 두 객체의 값이 같은가를 검사는데 반해 assertSame메서드는 두 객체가 동일한가 즉 하나의 객인 가를 확인한다.(== 연산자)
assertTrue(a);	조건 A가 참인가를 확인한다.
assertNotNull(a);	객체 A가 null이 아님을 확인한다.
 *
 */
public class example2Test {
	
	
	
	@Test
	public void testBubbleSort() {
		
		
		int inputData[] = {1, 5, 4, 3, 9, 3}; // 테스트 입력 데이터  
		int successData[] = {1, 3, 3, 4, 5, 9}; // 성공 예상 데이터 
		
		int result[] = example2.bubbleSort(inputData);
		
		for (int i : result) 	System.out.print(" " + i);

		assertArrayEquals(successData, result);
		
	}
	
	
	@Test
	public void testSelectioSort() {
		
		
		int inputData[] = {1, 5, 4, 3, 9, 3};
		int successData[] = {1, 3, 3, 4, 5, 9};
		
		int result[] = example2.selectionSort(inputData);
		
		for (int i : result) 	System.out.print(" " + i);

		assertArrayEquals(successData, result);
		
	}
	

}
