package com.java.dto;

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
	
}
