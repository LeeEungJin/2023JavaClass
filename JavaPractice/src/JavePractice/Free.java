package JavePractice;

import java.util.Scanner;

public class Free {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;
		String result = "";
		
		int i=0;
		int stack=0;
		
		num = scanner.nextInt();
		
		for(i=2 ; i <= num ; i++) {
			if(num%i==0) {
				stack = stack + 1 ;
			}
		}
		
		switch(stack) {
		case 1 :
			result = "�ڼ��Դϴ�.";
			break;
		default :
			result = "�ڼ��� �ƴմϴ�.";
		}
		System.out.println(result);
		
		scanner.close();
	}
}