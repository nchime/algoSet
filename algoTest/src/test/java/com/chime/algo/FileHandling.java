package com.chime.algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt")); 
			bw.write("test1\n");
			bw.write("test2");
			bw.write("test3");
			bw.write("test4");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		try {
			File f = new File("test.txt"); 
			FileReader fr = new FileReader(f); 
			BufferedReader br = new BufferedReader(fr);
			
			String line = null; 
			
			while((line = br.readLine()) != null) { 
				System.out.println("====");
				System.out.println(line);
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
