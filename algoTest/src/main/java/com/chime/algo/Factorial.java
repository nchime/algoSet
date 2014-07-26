package com.chime.algo;

public class Factorial {

	
	private long fResultNum; // Factorial 계산 결과값  
	
	public Factorial(int num, char type) { 
		
		if(type == 'N') { 
			setfResultNum(getFactorial1(num));
		}
		else if(type == 'J') { 
			setfResultNum(getFactorial2(num));
		} 
	}
	
	
	/**
	 * 단순 계산 로직.. 
	 * @param fnum
	 * @return
	 */
	public long getFactorial1(int fnum) {

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
	public long getFactorial2(int fnum) {
		if (fnum <= 1)
			return fnum;  
		else 
			return getFactorial2(fnum-1) * fnum;			
	}


	public long getfResultNum() {
		return fResultNum;
	}



	public void setfResultNum(long fResultNum) {
		this.fResultNum = fResultNum;
	}

	
	
	
}
