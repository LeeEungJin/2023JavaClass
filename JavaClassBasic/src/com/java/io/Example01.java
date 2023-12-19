package com.java.io;

import java.io.File;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {
		File filePath = new File("c:\\\\temp\\\\java\\\\file");
		File fileObj = new File("c:\\temp\\java\\file","example01.txt");
		try {
			
			filePath.mkdirs();
			
			boolean success = fileObj.createNewFile();
			if(success) {
				System.out.println("颇老 积己 己傍");
			}
			else {
				System.out.println("颇老 积己 角菩");
			}
			
			System.out.println(fileObj.getPath());
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}