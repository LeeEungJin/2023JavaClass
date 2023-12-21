package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int STUDENT_NUM;
		
		System.out.print("학생 수 : ");		
		STUDENT_NUM = scanner.nextInt(); scanner.nextLine();
		System.out.println();
		
		ScoreVO[] scores = new ScoreVO[STUDENT_NUM];
		
		for (int i=0 ; i<STUDENT_NUM ; i++) {
			scores[i] = new ScoreVO();
			scores[i].input();
		}
		
		
		System.out.print("순번\t");
		ScoreVO.printLabel();
		
		for ( int i=0 ; i<STUDENT_NUM ; i++) {
			System.out.print((i+1)+"\t");
			scores[i].printScore();
		}
		
		scanner.close();
	}
}