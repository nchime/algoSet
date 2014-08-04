package com.chime.algo;

public class StringTest {
	  
    private final static String HELLO  = "안녕하세요!";
 
    private int count = 1000;
    private int size  = 640;
    private long[] timeStamp  = new long[count+1];
    private long[] freeMem = new long[count+1];
    String s  = new String(HELLO);
    String s2 = new String(HELLO);
    StringBuffer sb = new StringBuffer(HELLO);
    StringBuffer sb2 = new StringBuffer(HELLO);
 
    public StringTest() {
    }
 
    public void printResult() {
       for (int i = 1; i <= count; i++) {
          System.out.println(i + "\t" + 
           (timeStamp[i] - timeStamp[0]) + "\t" + freeMem[i]);
       }
       System.gc();
    }
    
    public void test1() {
       for (int i = 0; i <= count; i++) {
          for (int j=0; j < size; j++) {
             s2 = s.concat(HELLO);
          }
          freeMem[i] = Runtime.getRuntime().freeMemory();
          timeStamp[i] = System.currentTimeMillis();
       }
    }
 
    public void test2() {
       for (int i = 0; i <= count; i++) {
          for (int j=0; j < size; j++) {
             sb = sb.append(HELLO);
             sb.setLength(6);
          }
          freeMem[i] = Runtime.getRuntime().freeMemory();
          timeStamp[i] = System.currentTimeMillis();
       }
    }
 
    public void test3() {
       for (int i = 0; i <= count; i++) {
          for (int j=0; j < size; j++) {
             s2 = s.substring(0,2);
          }
          freeMem[i] = Runtime.getRuntime().freeMemory();
          timeStamp[i] = System.currentTimeMillis();
       }
    }
 
    public void test4() {
       for (int i = 0; i <= count; i++) {
          for (int j=0; j < size; j++) {
             s2 = sb.substring(0,2);
          }
          freeMem[i] = Runtime.getRuntime().freeMemory();
          timeStamp[i] = System.currentTimeMillis();
       }
    }
 
    public void noop(String st) {
    }
    
    public void test5() {
       for (int i = 0; i <= count; i++) {
          for (int j=0; j < size; j++) {
             noop(s.toString());
          }
          freeMem[i] = Runtime.getRuntime().freeMemory();
          timeStamp[i] = System.currentTimeMillis();
       }
    }
 
    public void test6() {
       for (int i = 0; i <= count; i++) {
          for (int j=0; j < size; j++) {
             noop(sb.toString());
          }
          freeMem[i] = Runtime.getRuntime().freeMemory();
          timeStamp[i] = System.currentTimeMillis();
       }
    }
 
    public void test7() {
       for (int i = 0; i <= count; i++) {
          for (int j=0; j < size; j++) {
             s = new String(HELLO);
          }
          freeMem[i] = Runtime.getRuntime().freeMemory();
          timeStamp[i] = System.currentTimeMillis();
       }
    }
 
    public void test8() {
       for (int i = 0; i <= count; i++) {
          for (int j=0; j < size; j++) {
             sb = new StringBuffer(HELLO);
          }
          freeMem[i] = Runtime.getRuntime().freeMemory();
          timeStamp[i] = System.currentTimeMillis();
       }
    }
 
    public static void main(String[] args) {
    	
    	int MAX_LOOP = 10000; 

    	  StringBuffer sb = new StringBuffer();
    	  
    	  long sTime = System.currentTimeMillis();
    	 
    	  for ( int i = 0 ; i < MAX_LOOP ; i++ ) {
    	   sb.append("DUMMY TEXT");
    	  }
    	 
    	  System.out.println("Elapsed Time : " + (System.currentTimeMillis()-sTime));
    	  
    	  
    	  
    	  String str = "";
    	  
    	  long s2Time = System.currentTimeMillis();
    	 
    	  for ( int i = 0 ; i < MAX_LOOP ; i++ ) {
    	   str += "DUMMY TEXT";
    	  }
    	 
    	  System.out.println("Elapsed Time : " + (System.currentTimeMillis()-s2Time));
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	 }
    	
   
 }
