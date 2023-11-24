package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int STUDENT_NUM;
		
		System.out.print("�л� �� : ");		
		STUDENT_NUM = scanner.nextInt(); scanner.nextLine();
		System.out.println();
		
		ScoreVO[] scores = new ScoreVO[STUDENT_NUM];
		
		for (int i=0 ; i<STUDENT_NUM ; i++) {
			
			scores[i] = new ScoreVO();
			
			System.out.print(i+1 + "��° �л��� �̸� : ");
			scores[i].name = scanner.nextLine(); 
			
			System.out.print(i+1 + "��° �л��� ���� ���� : ");
			scores[i].kor = scanner.nextInt(); scanner.nextLine();
			
			System.out.print(i+1 + "��° �л��� ���� ���� : ");
			scores[i].eng = scanner.nextInt(); scanner.nextLine();
			
			System.out.print(i+1 + "��° �л��� ���� ���� : ");
			scores[i].mat = scanner.nextInt(); scanner.nextLine();
			
			System.out.print(i+1 + "��° �л��� ���� ���� : ");
			scores[i].sci = scanner.nextInt(); scanner.nextLine();
			
			System.out.println();
		}
		
		System.out.println("����\t�̸�\t����\t����\t����\t����\t����\t���");
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