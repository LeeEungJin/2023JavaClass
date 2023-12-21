package com.java.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO>{
	
	private String stuNum;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sci;
	private Date regDate;
	
	public Date getRegDate() {
		return regDate;
	}
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getSci() {
		return sci;
	}

	public int total() {
		return kor + eng + mat + sci;
	}
	
	public float ave() {
		return ((int)(total()*100/4f+5))/100f;
	}
	
	
	
	public void input() { //리턴 타입 없을때는 void
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번 : ");
		stuNum = scanner.nextLine();
		
		System.out.print("이름 : ");
		name = scanner.nextLine(); 
		
		System.out.print("국어 점수 : ");
		kor = scanner.nextInt();
		
		
		//////////////////////////anner.nextLine();
		
		System.out.print("영어 점수 : ");
		eng = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("수학 점수 : ");
		mat = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("과학 점수 : ");
		sci = scanner.nextInt(); scanner.nextLine();
		
		regDate = new Date();
		
		System.out.println();
	}
	
	public static void printLabel() {
		System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}
	
	public void printScore() {
		
		SimpleDateFormat stdFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		String regDate = stdFormat.format(this.regDate);
		String today = stdFormat.format(new Date());
		
		if(regDate.contentEquals(today)) {
			regDate = new SimpleDateFormat("HH:mm:ss").format(this.regDate);
		}
		
		System.out.println(stuNum + "\t+" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sci
								 + "\t" + total() + "\t" + ave() +"\t"+ regDate);

	}
	
	@Override
	public int hashCode() {
		return stuNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ScoreVO) {
			ScoreVO other = (ScoreVO)obj;
			return other.stuNum.contentEquals(stuNum);
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(ScoreVO other) {
		return other.getRegDate().compareTo(this.regDate);
	}
	
	
}
