package JavaClassBasic;

import java.util.Scanner;

public class JavaClassSecondhomework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String com_kwb = " "; // ����0 ����1 ��2
		int com_kwb_num = 0;

		String my_kwb = " "; // ����0 ����1 ��2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";

		String quit = "";

		while (!quit.toUpperCase().equals("Q")) {

			com_kwb_num = (int) (Math.random() * 3);

			System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
			System.out.println("����� ������?");

			while (true) {
				System.out.println("1.���� 2.���� 3.��");
				menu = scanner.nextInt();
				scanner.nextLine();

				if (menu < 1 || menu > 3 ) {
					System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
					System.out.println("�ٽ� �Է��Ͻʽÿ�.");
				} else {
					break;
				}
			}

			my_kwb_num = menu - 1;

			if (com_kwb_num == ((my_kwb_num + 1) % 3)) {
				juge = "�й��ϼ̽��ϴ�. ";
			} else {
				if (com_kwb_num == my_kwb_num) {
					juge = "���º� �Դϴ�. ";
				} else {
					juge = "�¸��ϼ̽��ϴ�. ";
				}
			}

			switch (com_kwb_num) {
			case 0:
				com_kwb = "����";
				break;
			case 1:
				com_kwb = "����";
				break;
			case 2:
				com_kwb = "��";
			}

			switch (my_kwb_num) {
			case 0:
				my_kwb = "����";
				break;
			case 1:
				my_kwb = "����";
				break;
			case 2:
				my_kwb = "��";
			}

			System.out.println("��ǻ�� : " + com_kwb);
			System.out.println("��  �� : " + my_kwb);
			System.out.println(juge + "\n");

			System.out.println("�����Ͻðڽ��ϱ�? (Q)\n");
			quit = scanner.nextLine();

		}

		scanner.close();
	}

}
