package Quiz4.com.java.dto;

import java.util.Scanner;

public class ShapeTriangle {
	
	public float TriangleHight;
	public float TriangleBase;
	
	public float Triangle() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("»ï°¢ÇüÀÇ ³ôÀÌ : ");
		TriangleHight = scanner.nextFloat();
		
		System.out.print("»ï°¢ÇüÀÇ ¹Øº¯ : ");
		TriangleBase = scanner.nextFloat();
		
		return TriangleHight * TriangleBase / 2 ;
		
	}
	

}
