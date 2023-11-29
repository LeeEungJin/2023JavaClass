package com.java.dto;

import java.util.Scanner;

public class ScoreVO {
	
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int sci;
	
	
	public int total() {
		return kor + eng + mat + sci;
	}
	
	public float ave() {
		return ((int)(total()*100/4f+5))/100f;
	}
	
	public void input() { //리턴 타입 없을때는 void
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scanner.nextLine(); 
		
		System.out.print("국어 점수 : ");
		kor = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("영어 점수 : ");
		eng = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("수학 점수 : ");
		mat = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("과학 점수 : ");
		sci = scanner.nextInt(); scanner.nextLine();
		
		System.out.println();
	}
	
	public static void printLabel() {
		System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}
	
	public void printScore() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sci
								 + "\t" + total() + "\t" + ave());

	}
	
	
}
