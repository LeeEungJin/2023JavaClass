package JavaClassBasic;

import java.util.Scanner;

public class JavaClassSecondhomework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String com_kwb=" ";		//	����0	����1	��2
		int com_kwb_num = 0;
		
		String my_kwb = " ";	//	����0	����1	��2
		int my_kwb_num = 0;
		
		int menu = 0;
		String juge =" ";	//  
		
		
		com_kwb_num = (int)(Math.random()*3);
		
		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.println("����� ������?");
		System.out.println("1.���� 2.���� 3.��");
		
		menu = scanner.nextInt();
		
		my_kwb_num = menu - 1 ;
		
		
		if (com_kwb_num == ((my_kwb_num+1)%3)){
			juge = "�й��ϼ̽��ϴ�. ";
		}
		else {
			if(com_kwb_num == my_kwb_num) {
				juge = "���º� �Դϴ�. ";
			}
			else {
				juge = "�¸��ϼ̽��ϴ�. ";
			}
		}
		
		if (my_kwb_num == 0) {
			my_kwb = "����";
		}
		else if (my_kwb_num == 1) {
			my_kwb = "����";
		}
		else {
			my_kwb = "��";
		}
		
		if (com_kwb_num == 0) {
			com_kwb = "����";
		}
		else if (com_kwb_num == 1) {
			com_kwb = "����";
		}
		else {
			com_kwb = "��";
		}
		
		System.out.println("��ǻ�� : " + com_kwb);
		System.out.println("��  �� : " + my_kwb);
		System.out.println(juge);
		
		scanner.close();
	}

}
