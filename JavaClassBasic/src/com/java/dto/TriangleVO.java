package com.java.dto;

public class TriangleVO {
	
	public int height=10;
	public int baseLine=100;
	
	{
		int num = (int)(Math.random()*11);
		
		if (num % 2 == 0) {
			height = 0;
			baseLine = 0;
		}
		else {
			height = 1;
			baseLine = 1;
		}
	}
	
	public TriangleVO() {}

	public TriangleVO(int height, int baseLine) {
		
		this.height = height;
		this.baseLine = baseLine;
	}
	
	
	

}
