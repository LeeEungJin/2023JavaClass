package com.java.main;

import com.java.dto.ScoreVO;

public class ScoreMain {
	public static void main(String[] args) {
		
		ScoreVO s = new ScoreVO();
		
		
		
		System.out.println("���� : " + s.total());
		System.out.println("��� : " + s.ave());
		
	}

}
