package JavaClassBasic;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String menu = "";

		do{

			System.out.println("1.ȸ������ 2.ȸ����ȸ 3.ȸ������ 4.ȸ������");
			System.out.println("�޴��� �����ϼ���. ( ���� : Q )");

			menu = scanner.nextLine();

			switch (menu) {
			case "1":
				System.out.println("..........ȸ������..........\n\n");
				break;
			case "2":
				System.out.println("..........ȸ����ȸ..........\n\n");
				break;
			case "3":
				System.out.println("..........ȸ������..........\n\n");
				break;
			case "4":
				System.out.println("..........ȸ������..........\n\n");
				break;
			case "q":
			case "Q":
				System.out.println("���α׷��� �����մϴ�.\n\n");
				break;
			default:
				System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�.");
				break;
			}
		}while (!menu.toUpperCase().equals("Q")) ;

		scanner.close();

	}

}
