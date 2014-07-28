package com.chime.algo;

public class ObjectArray {

	private Object[] data;
	private int count;

	public ObjectArray(int maxSize) {
		
		if(maxSize < 0) { 
			throw new IllegalArgumentException("Illegal Capacity : " + maxSize); 
		}

		this.data = new Object[maxSize];
		this.count = 0;
	}

	/**
	 * 끝에 obj를 추가한다.
	 * 
	 * @param obj
	 */
	public void add(Object obj) {

		this.data[this.count++] = obj;
	}

	/**
	 * 특정 위치 뒤에 obj를 추가한다.
	 * 
	 * @param index
	 * @param obj
	 */
	public void add(int index, Object obj) {

		// 먼저 밀고...
		for (int i = index; i < count; i++) {
			data[i + 1] = data[i]; // 해당 위치값에 object를 뒤로 한칸씩 민다..
		}
		this.count++; // 추가되었으므로 한칸 민다..

		data[index] = obj;

	}

	/**
	 * 특정 위치의 데이터를 삭제한다.
	 * 
	 * @param index
	 */
	public void remove(int index) {

		for (int i = index; i < count - 1; i++) {

			data[i] = data[i + 1];
		}

		this.count--;
		data[count] = null; // 제일 마지막 공간은 null 처리
	}
	
	
	/**
	 * 특정 obj를 찾아서 삭제한다.
	 * 메소드 내에서 해결..   --> 소스 재활용이 안된다. 
	 * @param obj
	 */
	public void remove2(Object obj) { 
		
		for (int i = 0; i < count; i++) {
			if(data[i].equals(obj)) {  // 일치하면.. 
				for(int j=i; j<count-1; j++) { 
					data[i] = data[i+1];
				} 
				this.count--; 
				data[count] = null; 
				break; 
			}
		}
		
	}
	
	
	/**
	 * 찾을려는 객체의 Object를 찾아 제거한다. 
	 * @param obj
	 */
	public void remove(Object obj) { 
		
		int index = find(obj); 
		remove(index); 
		
	}


	/**
	 * 배열 객체를 비교하여 index 값 추출, 일치하지 않을 경우 -1을 리턴한다. 
	 * @param obj
	 * @return
	 */
	public int find(Object obj) {
		int i;  
		for (i = 0; i < count; i++) {
			if(data[i].equals(obj)) { 
				break; 
			} else if(i == (count-1)) { 
				i = -1;
				break; 
			}
		}
		return i; 
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		StringBuffer sb = new StringBuffer("[");
		
		for (int i = 0; i < this.count; i++) {
			sb.append(data[i]).append(" ");  
		}
		
		sb.append("]"); 
		
		return sb.toString(); 
		
	}
}
