package Quiz4.com.java.dto;

import java.util.Scanner;

public class ShapeSquare {
	Scanner scanner = new Scanner(System.in);
	
	float SquareHight;
	float SquareBase;
	float Area;
	
	public float SquareArea() {
		
		System.out.print("사각형의 높이 : ");
		SquareHight = scanner.nextFloat();
		
		System.out.print("사각형의 밑변 : ");
		SquareBase = scanner.nextFloat();
		
		Area = ((int)((SquareHight * SquareBase)*100+5f))/100f;
		
		return Area;
	}
}
