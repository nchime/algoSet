package com.chime.algo;

import java.util.GregorianCalendar;
import java.util.Timer;

public class ThreadTest extends Thread {

	String ThreadName;

	public ThreadTest(String name) {

		this.ThreadName = name;
	}

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("쓰레드 : " + this.ThreadName);
		}
		
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public static void main(String[] args) {
		
		ThreadTest tc = new ThreadTest("test1 Thread!!! "); 
		ThreadTest tc2 = new ThreadTest("test2 Thread!!! "); 
		tc.start(); 
		tc2.start(); 
		
	} 

}
