package Quiz4.com.java.dto;

import java.util.Scanner;

public class ShapeTriangle {
	Scanner scanner = new Scanner(System.in);
	
	float TriangleHight;
	float TriangleBase;
	float Area;
		
	public float TriangleArea() {
		
		System.out.print("�ﰢ���� ���� : ");
		TriangleHight = scanner.nextFloat();
		
		System.out.print("�ﰢ���� �غ� : ");
		TriangleBase = scanner.nextFloat();
		
		Area = ((int)((TriangleHight * TriangleBase / 2)*100+5f))/100f;
		
		return Area ;
	}
	

}
