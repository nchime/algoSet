package com.chime.test;

import java.util.Scanner;

/**
 * @author chkwak
 * 2014. 8. 4. 오후 2:55:27
 */
public class MyLink {

	
	/**
	 * Node 데이터 타입  
	 * @author chkwak
	 * 2014. 8. 4. 오후 2:55:21
	 */
	public class Node {
		int data; 
		Node link;
		public int getData() {
			return data;
		} 
		
	}

	private Node pNode = null; 
	
	
	public static void main(String[] args) {

		MyLink ml = new MyLink();

		int choice;
		int temp;

		// 메뉴 출력..
		showMenu();
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("명령번호를 입력하세요 : ");
			choice = input.nextInt();

			switch (choice) {

			case 1:  // 노드 추가

				System.out.print("추가할 노드 값을 입력하세요 : ");
				temp = input.nextInt();
				ml.add(temp);

				break;
			case 2: // 노드 삭제
				temp = ml.delete();

				if (temp == -1)
					break;
				else
					System.out.println("삭제된 노드에 저장된 값 : " + temp);
				break;
			case 3:
				System.out.println("노드 리스트 조회");
				ml.showNodeLsit();
				break;
			case 4:
				System.out.println("종료합니다. ");
				System.exit(1);
			default:
				System.out.println("다시 입력하시오 ");
				break;
			}
		}

	}

	private void showNodeLsit() {

		
		Node ptr = pNode; 
		
		int n = 1;
		
		
		while (ptr != null) { 
			
			System.out.println(n + "번째 노드의 값 : " + ptr.getData());
			n++; 
			ptr = ptr.link; 
		}
		
		
	}

	/**
	 * 제일 끝 node 삭제 
	 * @return
	 */
	private int delete() {
		
		if(pNode == null) {
			System.out.println("Node가 없습니다");
			return -1; 
		}

		int temp = pNode.data;  // 삭제할 노드 추출
		Node ptr = pNode; 
		pNode=pNode.link; // 다음 노드를 가리키도록..  
		return temp;  //삭제된 노드 
	}

	/**
	 * 노드 추가하기 
	 * @param temp
	 */
	private void add(int temp) {

		//  신규 노드 인스턴스 생성.. 
		Node node = new Node(); 
		
		// 데이터 입력 
		node.data = temp;
		
		// 노드링크 입력
		if(pNode == null) node.link = null;  /// 노드가 하나도 없을 경우 
		else node.link = pNode; // 
		
		pNode = node; // 다음 노드를 현재 생성한 노드 값으로 교체 

	}

	private static void showMenu() {
		System.out.println("1.추가");
		System.out.println("2.삭제");
		System.out.println("3.보기");
		System.out.println("4.종료");
	}
}
