package com.java.dto;

public class RectangularVO {
	
	public int garo;
	public int sero;
	
	public RectangularVO() {
		
	}

	
	public RectangularVO(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
	}



	public int surface() {
		return garo*sero;
	}
	
	
}
