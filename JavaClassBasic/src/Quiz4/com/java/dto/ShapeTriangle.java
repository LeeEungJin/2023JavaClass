package Quiz4.com.java.dto;

import java.util.Scanner;

public class ShapeTriangle {
	Scanner scanner = new Scanner(System.in);
	
	public float TriangleHight;
	public float TriangleBase;
	public float Area;
		
	public float TriangleArea() {
		
		System.out.print("»ï°¢ÇüÀÇ ³ôÀÌ : ");
		TriangleHight = scanner.nextFloat();
		
		System.out.print("»ï°¢ÇüÀÇ ¹Øº¯ : ");
		TriangleBase = scanner.nextFloat();
		
		Area = ((int)((TriangleHight * TriangleBase / 2)*100+5f))/100f;
		
		return Area ;
		
	}
	

}
