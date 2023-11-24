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

		while (check) {
			System.out.println("���̸� ���ϴ� ������ �Է��Ͻÿ�.");
			System.out.println("1.�ﰢ��   2.�簢��   3.��");

			input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				ShapeTriangle tri = new ShapeTriangle();
				System.out.println(tri.Triangle());
				break;

			case 2:
				ShapeSquare squ = new ShapeSquare();
				System.out.println(squ.Square());
				break;

			case 3:
				ShapeCircle cir = new ShapeCircle();
				System.out.println(cir.Circle());
				break;
			}

			System.out.println("�����ðڽ��ϱ�? (Q) �ƴϸ� �ƹ��Է��̳� �Ͻʽÿ�.");
			quit = scanner.nextLine();

			switch (quit) {
			case "Q":
			case "q":
				check = false;
				System.out.println("�����ϰڽ��ϴ�.");
				break;
			default:
				check = true;
				break;
			}

		}

		scanner.close();

	}
}
