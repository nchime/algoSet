package com.chime.algo;

/**
 * 
 * 객체 배열 테스트 
 * @author chkwak
 *
 */
public class ObjectArray {
	
	private Object[] data; 
	private int count; 
	
	
	public ObjectArray(int maxSize) {
		
		this.data = new Object[maxSize];
		this.count = 0;  
	}
	
	
	/**
	 * 배열 마지막에 obj 삽입 
	 * @param obj
	 */
	public void add(Object obj) {
		
		// 지정된 배열 크기보다 큰 객체가 입력된다면.. 
		if(count >= data.length) {
			throw new ArrayIndexOutOfBoundsException(count + ">= " + data.length); 
		}
		
		data[count++] = obj; 
	}
	
	
	
	
	/* 객체 배열 출력
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		StringBuffer str = new StringBuffer("[");   
		
		for (int i = 0; i < data.length; i++) {
			str.append(data[i]).append(" "); 
		}
		str.append("]"); 
		
		System.out.println("String 길이 : " + str.length());
		
		
		return str.toString();  
		
	}
	

	

}
