package com.chime.algo;

public class FactorialTest {

	private static int FNUM = 10; 
	
	
	
	/// 서버 수정 작업 
	public static void main(String[] args) {
		
		Factorial f1 = new Factorial(FNUM, 'N');
		Factorial f2 = new Factorial(FNUM, 'J');		
		
		System.out.println(FNUM + "의 Factorial 계산 결과는 " + f1.getfResultNum());
		System.out.println(FNUM + "의 Factorial 계산 결과는 " + f2.getfResultNum());		
	}

}
