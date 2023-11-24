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
			
			System.out.print(i+1 + "번째 학생의 이름 : ");
			scores[i].name = scanner.nextLine(); 
			
			System.out.print(i+1 + "번째 학생의 국어 점수 : ");
			scores[i].kor = scanner.nextInt(); scanner.nextLine();
			
			System.out.print(i+1 + "번째 학생의 영어 점수 : ");
			scores[i].eng = scanner.nextInt(); scanner.nextLine();
			
			System.out.print(i+1 + "번째 학생의 수학 점수 : ");
			scores[i].mat = scanner.nextInt(); scanner.nextLine();
			
			System.out.print(i+1 + "번째 학생의 과학 점수 : ");
			scores[i].sci = scanner.nextInt(); scanner.nextLine();
			
			System.out.println();
		}
		
		System.out.println("순번\t이름\t국어\t영어\t수학\t과학\t총점\t평균");
		for(int i = 0 ; i<STUDENT_NUM ; i++) {
			System.out.println((i+1) + "\t" + scores[i].name
									 + "\t" + scores[i].kor
									 + "\t" + scores[i].eng
									 + "\t" + scores[i].mat
									 + "\t" + scores[i].sci
									 + "\t" + scores[i].total()
									 + "\t" + scores[i].ave());
		}
		
		scanner.close();
	}
}