package Quiz4.com.java.dto;

import java.util.Scanner;

public class ShapeCircle {
	Scanner scanner = new Scanner(System.in);
	
	float CircleRadius;
	float Area;
	
	
	public float CircleArea() {

		System.out.print("���� ������ : ");
		CircleRadius = scanner.nextFloat();
		
		float pi = ((int)(Math.PI*1000)/1000f);
		
		
		Area = ((int)((CircleRadius*CircleRadius*pi)*100+5f))/100f;
		
		return Area;
		
		}
}
