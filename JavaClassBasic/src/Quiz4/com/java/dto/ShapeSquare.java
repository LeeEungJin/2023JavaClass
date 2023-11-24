package Quiz4.com.java.dto;

import java.util.Scanner;

public class ShapeSquare {
	
	public float SquareHight;
	public float SquareBase;
	
	public float Square() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사각형의 높이 : ");
		SquareHight = scanner.nextFloat();
		
		System.out.print("사각형의 밑변 : ");
		SquareBase = scanner.nextFloat();
		
		return SquareHight * SquareBase;
		
		
	}

}
