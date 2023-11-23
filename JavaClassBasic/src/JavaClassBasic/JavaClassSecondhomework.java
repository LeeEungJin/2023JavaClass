package JavaClassBasic;

import java.util.Scanner;

public class JavaClassSecondhomework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String com_kwb = " "; // 가위0 바위1 보2
		int com_kwb_num = 0;

		String my_kwb = " "; // 가위0 바위1 보2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";

		String quit = "";

		while (!quit.toUpperCase().equals("Q")) {

			com_kwb_num = (int) (Math.random() * 3);

			System.out.println("컴퓨터는 결정했습니다.");
			System.out.println("당신의 선택은?");

			while (true) {
				System.out.println("1.가위 2.바위 3.보");
				menu = scanner.nextInt();
				scanner.nextLine();

				if (menu < 1 || menu > 3 ) {
					System.out.println("입력이 올바르지 않습니다.");
					System.out.println("다시 입력하십시오.");
				} else {
					break;
				}
			}

			my_kwb_num = menu - 1;

			if (com_kwb_num == ((my_kwb_num + 1) % 3)) {
				juge = "패배하셨습니다. ";
			} else {
				if (com_kwb_num == my_kwb_num) {
					juge = "무승부 입니다. ";
				} else {
					juge = "승리하셨습니다. ";
				}
			}

			switch (com_kwb_num) {
			case 0:
				com_kwb = "가위";
				break;
			case 1:
				com_kwb = "바위";
				break;
			case 2:
				com_kwb = "보";
			}

			switch (my_kwb_num) {
			case 0:
				my_kwb = "가위";
				break;
			case 1:
				my_kwb = "바위";
				break;
			case 2:
				my_kwb = "보";
			}

			System.out.println("컴퓨터 : " + com_kwb);
			System.out.println("당  신 : " + my_kwb);
			System.out.println(juge + "\n");

			System.out.println("종료하시겠습니까? (Q)\n");
			quit = scanner.nextLine();

		}

		scanner.close();
	}

}
