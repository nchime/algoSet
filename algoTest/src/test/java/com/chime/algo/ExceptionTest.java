package com.chime.algo;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			callException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("시스템을 종료합니다");
		}

	}

	private static void callException() throws MyException {
		// 조건없이 그냥 던진다..
		throw new MyException();
	}

}
