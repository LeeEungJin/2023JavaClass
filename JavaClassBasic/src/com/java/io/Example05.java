package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example05 {
	public static void main(String[] args) {
			File file = new File("example03.txt");
			if (!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			try {
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			
			String str = null;
			
			while ((str = br.readLine()) != null) {
				System.out.print(str);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
