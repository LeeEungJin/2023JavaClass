package JavaClassBasic;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String menu = "";

		do{

			System.out.println("1.회원가입 2.회원조회 3.회원수정 4.회원삭제");
			System.out.println("메뉴를 선택하세요. ( 종료 : Q )");

			menu = scanner.nextLine();

			switch (menu) {
			case "1":
				System.out.println("..........회원가입..........\n\n");
				break;
			case "2":
				System.out.println("..........회원조회..........\n\n");
				break;
			case "3":
				System.out.println("..........회원수정..........\n\n");
				break;
			case "4":
				System.out.println("..........회원삭제..........\n\n");
				break;
			case "q":
			case "Q":
				System.out.println("프로그램을 종류합니다.\n\n");
				break;
			default:
				System.out.println("메뉴선택이 올바르지 않습니다.");
				break;
			}
		}while (!menu.toUpperCase().equals("Q")) ;

		scanner.close();

	}

}
