package Quiz4.com.java.dto;

import java.util.Scanner;

public class ShapeCircle {
	
	public int CircleRadius;
	public int CircleArea;
	

	public float Circle() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� ������ : ");
		CircleRadius = scanner.nextInt();
		
		float pi = ((int)(Math.PI*1000)/1000f);
		
		System.out.print("���� ���� : ");
		
		return CircleRadius*CircleRadius*pi;
		
		}
}
