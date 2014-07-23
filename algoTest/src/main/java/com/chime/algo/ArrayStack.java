package com.chime.algo;

/**
 * Stack 자료관리 알고리즘  
 * http://hyeonstorage.tistory.com/262 참조 
 * @author chkwak
 *
 */
public class ArrayStack {
	
	private int maxSize;
	private int top;
	private Object[] stackArray;  
	
	
	public ArrayStack(int maxSize) {
		
		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize]; 
		this.top = -1; 
	}
	
	
	
	/**
	 * 스택이 비었는지 체크 
	 * @return
	 */
	public boolean empty() {
		return (top == -1);  
	}
	
	
	/**
	 * 스택이 가득 찼는지 체크 
	 * @return
	 */
	public boolean full() {
		return (top == maxSize -1); 
	}
	
	

	/**
	 * 스택을 쌓는다.
	 * @param item
	 */
	public void push(Object item) {
		// 스택이 가득 찼다면.. 
		if(full()) throw new ArrayIndexOutOfBoundsException((top +1) + ">=" + maxSize);  
		
		// 스택 객체 증가
		stackArray[++top] = item; 	
	}
	
	
	/**
	 * 스택 가장 상단 객체 리턴 
	 * @return
	 */
	public Object peek() {

		 if(empty()) throw new ArrayIndexOutOfBoundsException(top);   
		
		// Top에 위치한 객체 리턴.. 
		return stackArray[top]; 
		
	}
	
	
	/**
	 * 가장 위의 데이터 제거 
	 * @return
	 */
	public Object pop() { 
		
		/// 제일 상단 객체를 선택 
		Object item = peek(); 
		top--; 
		return item; 
	}



	public int getMaxSize() {
		return maxSize;
	}



	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	
	
	
	
	

}
