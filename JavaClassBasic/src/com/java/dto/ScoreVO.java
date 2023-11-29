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
	
	public void input() { //���� Ÿ�� �������� void
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = scanner.nextLine(); 
		
		System.out.print("���� ���� : ");
		kor = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("���� ���� : ");
		eng = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("���� ���� : ");
		mat = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("���� ���� : ");
		sci = scanner.nextInt(); scanner.nextLine();
		
		System.out.println();
	}
	
	public static void printLabel() {
		System.out.println("�̸�\t����\t����\t����\t����\t����\t���");
	}
	
	public void printScore() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sci
								 + "\t" + total() + "\t" + ave());

	}
	
	
}
