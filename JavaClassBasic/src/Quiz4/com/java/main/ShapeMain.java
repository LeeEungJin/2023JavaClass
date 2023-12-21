package Quiz4.com.java.main;

import java.util.Scanner;

import Quiz4.com.java.dto.ShapeCircle;
import Quiz4.com.java.dto.ShapeSquare;
import Quiz4.com.java.dto.ShapeTriangle;

public class ShapeMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int input = 0;
		boolean check = true;
		String quit = "";

		do {
			System.out.println("���̸� ���ϴ� ������ �Է��Ͻÿ�.");
			System.out.println("1.�ﰢ��   2.�簢��   3.��");

			input = scanner.nextInt(); scanner.nextLine();

			switch (input) {
			case 1:
				ShapeTriangle tri = new ShapeTriangle();
				System.out.println("�ﰢ���� ���̴� : " + tri.TriangleArea());
				break;

			case 2:
				ShapeSquare squ = new ShapeSquare();
				System.out.println("�簢���� ���̴� : " + squ.SquareArea());
				break;

			case 3:
				ShapeCircle cir = new ShapeCircle();
				System.out.println("���� ���̴� : " + cir.CircleArea());
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
			}

			
			System.out.println();
			System.out.println("�����ðڽ��ϱ�? (Q)" + "\n" +"����Ͻ÷��� �ƹ��Է��̳� �Ͻʽÿ�.");
			quit = scanner.nextLine();

			switch (quit) {
			case "Q": case "q":
				check = false;
				System.out.println("�����ϰڽ��ϴ�.");
				break;
			default:
				System.out.println("");
				check = true;
				break;
			}
		} while(check);

		scanner.close();

	}
}
