package JavaClassBasic;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inputInt = 0;

		inputInt = scanner.nextInt();

		switch (inputInt % 2) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.");
			break;
		}

		scanner.close();

	}

}
