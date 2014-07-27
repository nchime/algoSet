package com.chime.algo;

public class SimpleLinkedList {

	private Node header;
	private int size;

	/**
	 * 최초에 LinkedList 생성 처음 생겼으므로 노트 및 크기가 모두 초기상태
	 */
	public SimpleLinkedList() {
		this.header = new Node(null);
		this.size = 0;

	}

	/**
	 * Node 관리 클래스
	 * 
	 * @author chimeX430
	 *
	 */
	public class Node {

		private Object data;
		private Node nextNode;

		public Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}

	}

	public Object get(int index) {

		return getNode(index).data;
	}

	/**
	 * index 위치의 노드를 반환한다.
	 * 
	 * @param index
	 * @return
	 */
	private Node getNode(int index) {

		// index는 0보다 작거나 전체 node 숫자보다 클 수는 없다.
		if (index < 0 || index > this.size) {
			System.out.println("node 순번이 잘못되었습니다 ");
			throw new IndexOutOfBoundsException("Index : " + index
					+ ", Size : " + size);
		}

		// LinkedList 제일 앞단을 가리키고 있는 node를 생성
		Node node = header.nextNode;

		// 해당 index까지 이동
		for (int i = 0; i < index; i++) {
			node = node.nextNode;
		}

		return node;
	}

	public Object getFirst() {

		return get(0);
	}

	/**
	 * 노드를 첫번째 순번에 끼워넣는다.
	 * 
	 * @param data
	 */
	public void addFirst(Object data) {

		Node newNode = new Node(data);

		// 기존에 header node가 가리키고 있던 포인터를 그대로 이어받음
		newNode.nextNode = this.header.nextNode;
		// header의 다음 Node를 새로운 node로 교체함
		this.header.nextNode = newNode;
		// 하나가 증가했으므로..
		size++;
	}

	/**
	 * 특정 순번에 node를 추가한다.
	 * 
	 * @param data
	 */
	public void add(int index, Object data) {

		if (index == 0) {
			addFirst(data);
			return;
		} else if (index < 0) {
			throw new IndexOutOfBoundsException("Index : " + index
					+ ", Size : " + this.size);
		}

		// 추가할 node 생성
		Node newNode = new Node(data);

		// index 순번 이전 node를 가져온다.
		Node previousNode = getNode(index - 1);
		Node next = previousNode.nextNode;

		previousNode.nextNode = newNode;
		newNode.nextNode = next;

		size++;

	}

	/**
	 * 마지막 순서에 Node를 추가한다.
	 * 
	 * @param data
	 */
	public void addLast(Object data) {
		add(size, data);
	}

	/**
	 * 마지막 순서에 Node를 추가한다.
	 * 
	 * @param data
	 */
	public void add(Object data) {
		addLast(data);
	}
	
	/**
	 * 첫번째 노드를 삭제하고 삭제한 노드를 반환한다.  
	 * @return
	 */
	public Object removeFirst() {

		if(this.size < 0) { 
			System.out.println("삭제할 노드가 없습니다 ");
		}
		
		// header 노드의 다음 노드를 첫번 노드의 다음 노드로 변경해준다. 
		Node firstNode = getNode(0);  
		this.header.nextNode = firstNode.nextNode; 
		size--; // 삭제했으므로 전체 Node를 줄이고..  
		
		return firstNode.data; 
	}

	
	/**
	 * 특정 index의 Node를 삭제한다. 
	 * 
	 * @param index
	 * @return
	 */
	public Object remove(int index) { 
		if(index > size || index < 0) { 
			  throw new IndexOutOfBoundsException("Index : " + index + ", Size : " +size);
		} else if(index == 0) {
			return removeFirst(); 
		}

		Node previousNode = getNode(index-1);
		Node removeNode = getNode(index);
		
		previousNode.nextNode = removeNode.nextNode;
		
		size--; 
		
		return removeNode.data; 
	}
	
	
	/* 
	 * 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		StringBuffer sb = new StringBuffer("[");
		
		System.out.println("size:" + size);
		
		for (int i = 0; i < size; i++) {
			sb.append(" " + get(i));  
		}
		
		sb.append("]");
		return sb.toString();
	}
	
	
	

}
