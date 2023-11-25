package Quiz4.com.java.dto;

import java.util.Scanner;

public class ShapeCircle {
	Scanner scanner = new Scanner(System.in);
	
	public float CircleRadius;
	float Area;
	
	
	public float CircleArea() {

		System.out.print("원의 반지름 : ");
		CircleRadius = scanner.nextFloat();
		
		float pi = ((int)(Math.PI*1000)/1000f);
		
		
		Area = ((int)((CircleRadius*CircleRadius*pi / 2)*100+5f))/100f;
		
		return Area;
		
		}
}
