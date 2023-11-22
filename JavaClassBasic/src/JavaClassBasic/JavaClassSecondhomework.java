package JavaClassBasic;

import java.util.Scanner;

public class JavaClassSecondhomework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String com_kwb=" ";		//	가위0	바위1	보2
		int com_kwb_num = 0;
		
		String my_kwb = " ";	//	가위0	바위1	보2
		int my_kwb_num = 0;
		
		int menu = 0;
		String juge =" ";	//  
		
		
		com_kwb_num = (int)(Math.random()*3);
		
		System.out.println("컴퓨터는 결정했습니다.");
		System.out.println("당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");
		
		menu = scanner.nextInt();
		
		my_kwb_num = menu - 1 ;
		
		
		if (com_kwb_num == ((my_kwb_num+1)%3)){
			juge = "패배하셨습니다. ";
		}
		else {
			if(com_kwb_num == my_kwb_num) {
				juge = "무승부 입니다. ";
			}
			else {
				juge = "승리하셨습니다. ";
			}
		}
		
		if (my_kwb_num == 0) {
			my_kwb = "가위";
		}
		else if (my_kwb_num == 1) {
			my_kwb = "바위";
		}
		else {
			my_kwb = "보";
		}
		
		if (com_kwb_num == 0) {
			com_kwb = "가위";
		}
		else if (com_kwb_num == 1) {
			com_kwb = "바위";
		}
		else {
			com_kwb = "보";
		}
		
		System.out.println("컴퓨터 : " + com_kwb);
		System.out.println("당  신 : " + my_kwb);
		System.out.println(juge);
		
		scanner.close();
	}

}
