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
			System.out.println("넓이를 원하는 도형을 입력하시오.");
			System.out.println("1.삼각형   2.사각형   3.원");

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

			System.out.println("끝내시겠습니까? (Q) 아니면 아무입력이나 하십시오.");
			quit = scanner.nextLine();

			switch (quit) {
			case "Q":
			case "q":
				check = false;
				System.out.println("종료하겠습니다.");
				break;
			default:
				check = true;
				break;
			}

		}

		scanner.close();

	}
}
