package JavaClassBasic;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inputInt = 0;

		inputInt = scanner.nextInt();

		switch (inputInt % 7) {
		case 0:case 1:
			System.out.println("�������� 0�Ǵ� 1�Դϴ�.");
			break;
		case 2:case 3:
			System.out.println("�������� 2�Ǵ� 3�Դϴ�.");
			break;
		case 4:
			System.out.println("�������� 4�Դϴ�.");
			break;
		default:
			System.out.println("�������� 5�Ǵ� 6�Դϴ�.");
		}

		scanner.close();

	}

}
