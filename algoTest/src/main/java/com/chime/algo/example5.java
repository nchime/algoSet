package com.chime.algo;

public class example5 {

	
	public static void main(String[] args) {
		

		int testNum = 50;
	
		
		long start = System.currentTimeMillis(); 
		System.out.println(testNum + " Factorial = " + getFactorial1(testNum));
		long end = System.currentTimeMillis();
		
		System.out.println("처리 시간 : " + (end - start));
		
		
		start = System.currentTimeMillis(); 
		System.out.println(testNum + " Factorial = " + getFactorial2(testNum));
		end = System.currentTimeMillis();
		
		System.out.println("처리 시간 : " + (end - start));
		
		
	}

	/**
	 * Factorial 계산 단순 로직 
	 * @param fnum
	 * @return
	 */
	private static long getFactorial1(int fnum) {

		long result = 0;   

		
		int temp = fnum ; 
		
		if(fnum > 1) {   
			result = temp * (temp -1);
		} else { 
			result = 1; 
		}
		temp--; 
		
		while (temp > 1 ) {    
			result = result * (temp -1);
			temp--; 
		}
		return result;
		
	}

	
	/**
	 * 재귀호출을 통한 Factorial 계산
	 * @param n
	 * @return
	 */
	public static long getFactorial2(int fnum) {
		if (fnum <= 1)
			return fnum;
		else 
			return getFactorial2(fnum-1) * fnum;
	}
	
}
